
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Formatter extends Main
{
    public void fmtln(String formattrack, Object num) {
        System.out.println(String.format(formattrack, num));
    }
    public void fmt(String formattrack, Object num) {
        System.out.print(String.format(formattrack, num));
    }
}
