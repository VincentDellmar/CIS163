
/**
 * Write a description of class Renderer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Renderer
{
    private void ClearFn() {System.out.print('\u000C');};
    public void FlushBuffer() {
        Buffer = new CharBuffer[x][y];
        for (int __y = 0; __y < y; __y++) {
            for (int __x = 0; __x < x; __x++) {
                Buffer[__x][__y] = new CharBuffer(" ");
            }
        }
    };
    private int x;
    private int y;
    private CharBuffer[][] Buffer = {};
    
    /**
     * Constructor for objects of class Renderer
     */
    public Renderer(int _x, int _y) {
        x = _x;
        y = _y;
        Buffer = new CharBuffer[_x][_y];
        for (int __y = 0; __y < y; __y++) {
            for (int __x = 0; __x < x; __x++) {
                Buffer[__x][__y] = new CharBuffer(" ");
            }
        }
    }
    public void Update()
    {
        ClearFn();
        for (int _y = 0; _y < y; _y++) {
            for (int _x = 0; _x < x; _x++) {
                System.out.print(Buffer[_x][_y].c);
            }
        System.out.println("");
        }
    }
    public void Point(int _x, int _y, String v) {
        Buffer[_x][_y] = new CharBuffer(v);
    }
    // Circle
    public void Circle(int _x, int _y, int size) {
        for(int n = 0; n < 314; n++) {
            int n_x = (int)(size * Math.sin(n));
            int n_y = (int)(.5 * size * Math.cos(n));
            Buffer[_x + n_x][_y + n_y] = new CharBuffer("@");    
        } 
    }
    public void Circle(int _x, int _y, int size, int res) {
        for(int n = 0; n < res; n++) {
            int n_x = (int)(size * Math.sin(n));
            int n_y = (int)(.5 * size * Math.cos(n));
            Buffer[_x + n_x][_y + n_y] = new CharBuffer("@");    
        } 
    }
}
