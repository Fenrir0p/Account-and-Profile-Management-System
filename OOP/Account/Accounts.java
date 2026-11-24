package Account;

import Authentication.SignIn;
import Database.AccountStorage;
import PersonalDatas.PersonalInfo;
import Database.AccountInfos;

import java.util.Scanner;

public class Accounts {

    public static void Profile(Scanner scan){

        ProfileDetails(
                SignIn.currentUser,
                scan
        );

    }

    public static void ProfileDetails(
            PersonalInfo user,
            Scanner scan)
    {


        System.out.println("Profile Details");

        System.out.println("First Name: " + user.getFirstName());

        System.out.println("Last Name: " + user.getLastName());

        System.out.println("Gmail: " + user.getGmail());

        System.out.println("Number: " + user.getPhoneNumber());

        System.out.println("Change Password: ");

        System.out.println("-------------------------------------");

        System.out.print("Edit Profile Details Type Yes or No: ");

        String answer = scan.nextLine().trim();

        if (answer.equalsIgnoreCase("yes")) {
            EditProfile(scan, user);
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Returning to profile.");
        } else {
            System.out.println("Please type Yes or No.");
        }

    }

    public static void EditProfile(Scanner scan,
            PersonalInfo user) {

        System.out.println("Edit Profile Details");

        System.out.println("Edit Profile Details");

        System.out.println("1.Username: " + user.getUsername());
        System.out.println("2.First Name: " + user.getFirstName());
        System.out.println("3.Last Name:  " + user.getLastName());
        System.out.println("4.Gmail:  " + user.getGmail());
        System.out.println("5.Phone Number:  " + user.getPhoneNumber());
        System.out.println("6.Change Password: ");
        System.out.println("7.Back");

        System.out.print("Enter Your choice: ");
        int choice = scan.nextInt();
        scan.nextLine();

        switch (choice){
            case 1:

                System.out.print("Enter new Username: ");
                user.setUsername(scan.nextLine());

                break;
            case 2:

                System.out.print("Enter new First Name: ");
                user.setFirstName(scan.nextLine());

                break;

            case 3:

                System.out.print("Enter last Name: ");
                user.setLastName(scan.nextLine());

                break;

            case 4:

                System.out.println("Enter new Gmail: ");
                user.setGmail(scan.nextLine());

                break;

            case 5:

                System.out.print("Enter Phone Number: ");
                user.setPhoneNumber(scan.nextLine());

                break;
            case 6:

                ChangePass(scan, user);

                break;

                default: {
                    System.out.println("Default");
                }
        }
        System.out.println("Profile Updated!");
    }

    public static void ChangePass (Scanner scan, PersonalInfo user){

        System.out.println("Current Password: ");
        String password = scan.nextLine();

        if (!password.equals(user.getPassword())){
            System.out.println("Passwords don't match!");
            return;
        }

        System.out.println("New Password: ");
        String newPassword = scan.nextLine();

        System.out.println("Confirm Password: ");
        String confirmPassword = scan.nextLine();

        if (!newPassword.equals(confirmPassword)){
            System.out.println("Passwords don't match!");
            return;
        }

        user.setPassword(newPassword);

        AccountStorage.users.add(user);

        System.out.println("New Password Updated!");

    }
}
