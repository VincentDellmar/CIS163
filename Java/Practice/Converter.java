
/**
 * Write a description of class Converter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Converter extends Main
{
    public static int BinaryDecimal(String BinaryStr) {
        return Integer.parseInt(BinaryStr, 2);
    }
    public static int BinaryDecimal(int Binary) {
        int num = Binary;
        int dec_value = 0;

        // Initializing base value to 1, i.e 2^0
        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return dec_value;
    }
    public static int OctalDecimal(String BinaryStr) {
        return Integer.parseInt(BinaryStr, 8);
    }
    public static String DecimalBinary(int Decimal) {
        return Integer.toBinaryString(Decimal);
    }
}
