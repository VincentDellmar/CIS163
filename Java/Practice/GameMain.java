import java.util.concurrent.TimeUnit;
import java.io.*;
/**
 * Write a description of class GameMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameMain
{
    private Renderer renderersys;
    private int x_pnt;
    private int y_pnt;
    private final int x_max = 20;
    private final int y_max = 20;
    /**
     * Constructor for objects of class GameMain
     */
    public GameMain() {
        renderersys = new Renderer(x_max, y_max);

    }

    private void Waiter(int ms) {
        try
        {
            TimeUnit.MILLISECONDS.sleep(ms);
        }
        catch (java.lang.InterruptedException ie)
        {
            ie.printStackTrace();
        }

    };

    private int KeyPress() {
        String key = "";
        BufferedReader input = new BufferedReader ( new InputStreamReader ( System.in ) );
        try{
            String read_line = input.readLine();
            key = read_line.substring(0, 1);
        }
        catch(Exception e){e.printStackTrace();}
        if (key.equals("w")) {
            y_pnt = Math.max(1, Math.min(y_max - 2, y_pnt - 1));
        } else if (key.equals("s")) {
            y_pnt = Math.max(1, Math.min(y_max - 2, y_pnt + 1));
        } else if (key.equals("a")) {
            x_pnt = Math.max(1, Math.min(x_max - 2, x_pnt - 1));
        } else if (key.equals("d")) {
            x_pnt = Math.max(1, Math.min(x_max - 2, x_pnt + 1));
        } else if (key.equals("e")) {return -1;}
        return 0;
    }
    private void Border() {
        for (int y = 0; y < y_max; y++) {
            renderersys.Point(0, y, "O");
        }
        for (int y = 0; y < y_max; y++) {
            renderersys.Point(x_max - 1, y, "O");
        }
        for (int x = 0; x < x_max; x++) {
            renderersys.Point(x, 0, "O");
        }
        for (int x = 0; x < x_max; x++) {
            renderersys.Point(x, y_max - 1, "O");
        }
        
        renderersys.Circle(x_max/2,y_max/2,10);
        renderersys.Circle(x_max/2,y_max/2,7);
    }
    public void Game() {
        x_pnt = x_max / 2;
        y_pnt = y_max / 2;
        renderersys.FlushBuffer();
        Border();
        renderersys.Point(x_pnt, y_pnt, "#");
        renderersys.Update();
        while (true) {
            renderersys.FlushBuffer();
            if (KeyPress() == -1) {
                renderersys.FlushBuffer();
                renderersys.Update();
                return;
            }
            Border();
            renderersys.Point(x_pnt, y_pnt, "#");
            renderersys.Update();
            Waiter(50);
        }
    }

    public static void Main()
    {
        GameMain _game = new GameMain();
        _game.Game();
    }
}
