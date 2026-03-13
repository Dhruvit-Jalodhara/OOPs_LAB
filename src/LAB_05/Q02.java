package LAB_05;

class InvalidHexException extends Exception {
    InvalidHexException(String msg) {
        super(msg);
    }
}

public class Q02 {
    static void checkHex(String str) throws InvalidHexException {

        // Convert string to uppercase for uniform checking
        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F'))) {
                throw new InvalidHexException("Not a Hexadecimal Number");
            }
        }

        System.out.println(str + " is a Valid Hexadecimal Number");
    }

    public static void main(String[] args) {

        String num = "1A3F13";   // assign number as string

        try {
            checkHex(num);
        } catch (InvalidHexException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Ending the program");
        }
    }
}
