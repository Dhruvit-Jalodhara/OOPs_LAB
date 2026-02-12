package LAB_04;

public class Q2_PasswordValidator {
    public static boolean checkPassword(String password){

        // Length check
        if(password.length() < 5 || password.length() > 12)
            return false;

        boolean hasLower = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {

            // No uppercase allowed
            if(Character.isUpperCase(ch))
                return false;

            // No special characters allowed
            if(!Character.isLetterOrDigit(ch))
                return false;

            // contains lower-case
            if(Character.isLowerCase(ch))
                hasLower = true;

            // contains digit
            if(Character.isDigit(ch))
                hasDigit = true;
        }

        if(!hasLower || !hasDigit)
            return false;


        int n = password.length();

        for (int len = 1; len <= n/2; len++) {
            for (int i = 0; i <= n - 2 * len; i++) {

                String part1 = password.substring(i, i + len);
                String part2 = password.substring(i + len, i + 2 * len);

                if (part1.equals(part2)) {
                    return false;  // Immediate pattern found
                }
            }
        }

        return true;
    }
    public static void main(String[] args) {

        System.out.println(checkPassword("abcanan1"));
        System.out.println(checkPassword("abc11se"));
        System.out.println(checkPassword("123sd123"));
        System.out.println(checkPassword("adfasdsdf"));
        System.out.println(checkPassword("Aasdfasd12"));
    }
}
