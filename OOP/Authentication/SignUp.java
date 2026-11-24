package Authentication;

import Database.AccountStorage;
import PersonalDatas.PersonalInfo;
import java.util.Scanner;

public class SignUp {

    public static PersonalInfo user;

    public static void SignedUp(Scanner scan){

        System.out.print("Gmail: ");
        String gmail = scan.nextLine();

        System.out.print("Enter Password: ");
        String password = scan.nextLine();

        System.out.print("Confirm Password: ");
        String confirmPassword = scan.nextLine();

        // Check if passwords match
        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match.");
            return;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for(int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if(Character.isUpperCase(ch)) {
                hasUpper = true;
            }
            else if(Character.isLowerCase(ch)) {
                hasLower = true;
            }
            else if(Character.isDigit(ch)) {
                hasDigit = true;
            }
            else {
                hasSpecial = true;
            }

        }

        if(password.length() < 8 ||
                !hasUpper ||
                !hasLower ||
                !hasDigit ||
                !hasSpecial) {

            System.out.println("Password must contain:");
            System.out.println("- At least 8 characters");
            System.out.println("- Uppercase letter");
            System.out.println("- Lowercase letter");
            System.out.println("- Number");
            System.out.println("- Special character");
            return;
        }

        // Create the object AFTER validation
        user = new PersonalInfo(gmail, password);

        AccountStorage.users.add(user);

        System.out.println("Account Created Successfully!");
    }
}