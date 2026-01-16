package Core_Programming.Methods.Level3;

/**
 * OTPGenerator class generates One-Time Passwords and checks their uniqueness using methods.
 * The program demonstrates advanced method usage by creating functions to generate
 * random 6-digit OTPs (100000-999999) and verify if all generated OTPs are unique.
 * It generates 10 OTPs and displays them along with uniqueness status.
 */
public class OTPGenerator {

    /**
     * Generates a random 6-digit OTP.
     * @return Random OTP between 100000 and 999999
     */
    public static int generateOTP() {
        // Generating random number between 100000 and 999999
        return 100000 + (int)(Math.random() * 900000);
    }

    /**
     * Checks if all OTPs in the array are unique (no duplicates).
     * @param otp Array of OTPs
     * @return true if all OTPs are unique, false otherwise
     */
    public static boolean isUnique(int[] otp) {
        // Nested loops to compare each OTP with all others
        for (int i = 0; i < otp.length; i++)
            for (int j = i + 1; j < otp.length; j++)
                // Returning false if duplicate found
                if (otp[i] == otp[j]) return false;
        // Returning true if no duplicates found
        return true;
    }

    public static void main(String[] args) {
        // Creating array to store 10 OTPs
        int[] otp = new int[10];
        // Loop to generate and display 10 OTPs
        for (int i = 0; i < 10; i++) {
            // Calling method to generate OTP
            otp[i] = generateOTP();
            // Displaying each generated OTP
            System.out.println("OTP " + (i + 1) + ": " + otp[i]);
        }
        // Calling method to check uniqueness and displaying result
        System.out.println("All OTPs Unique: " + isUnique(otp));
    }
}
