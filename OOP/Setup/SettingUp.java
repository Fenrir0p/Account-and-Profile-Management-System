package Setup;

import Database.AccountInfos;
import Account.Home;
import Authentication.SignIn;
import PersonalDatas.PersonalInfo;
import Account.Accounts;

import java.util.Scanner;

public class SettingUp {

    public static void SetUp(Scanner scan){

        UsernameSetup(scan);

        PersonalDetails(scan);

        ContactDetails(scan);

        SecurityDetails(scan);

        SignIn.currentUser.setSetUpComplete(true);

        AccountInfos.saveUserInfos(SignIn.currentUser);

        System.out.println("\nSetup Complete!");

        UserAccount(scan);

    }

    public static void UsernameSetup(Scanner scan)
    {
        PersonalInfo user = SignIn.currentUser;

        System.out.println("\n=== Username Setup ===");

        System.out.println("1. Create Username");

        System.out.println("2. Skip");

        System.out.print("Enter Choice: ");

        int choice = scan.nextInt();

        scan.nextLine();

        if(choice == 1){

            System.out.print("Username: ");

            user.setUsername(scan.nextLine());

            System.out.println("Username Saved!");
        }
    }

    public static void PersonalDetails(
            Scanner scan)
    {
        PersonalInfo user =
                SignIn.currentUser;

        System.out.println(
                "\n=== Personal Details ===");

        System.out.println(
                "1. Fill Details");

        System.out.println(
                "2. Skip");

        System.out.print(
                "Enter Choice: ");

        int choice =
                scan.nextInt();

        scan.nextLine();

        if(choice == 1){

            System.out.print(
                    "First Name: ");

            user.setFirstName(
                    scan.nextLine());

            System.out.print(
                    "Last Name: ");

            user.setLastName(
                    scan.nextLine());

            System.out.println(
                    "Personal Details Saved!");
        }
    }

    public static void ContactDetails(
            Scanner scan)
    {
        PersonalInfo user =
                SignIn.currentUser;

        System.out.println(
                "\n=== Contact Details ===");

        System.out.println(
                "1. Fill Contact Details");

        System.out.println(
                "2. Skip");

        System.out.print(
                "Enter Choice: ");

        int choice =
                scan.nextInt();

        scan.nextLine();

        if(choice == 1){

            System.out.print(
                    "Phone Number: ");

            user.setPhoneNumber(
                    scan.nextLine()  );

            System.out.println(
                    "Contact Details Saved!");
        }
    }

    public static void SecurityDetails(
            Scanner scan)
    {
        PersonalInfo user =
                SignIn.currentUser;

        System.out.println(
                "\n=== Security Details ===");

        System.out.println(
                "1. Setup Security Question");

        System.out.println(
                "2. Skip");

        System.out.print(
                "Enter Choice: ");

        int choice =
                scan.nextInt();

        scan.nextLine();

        if(choice == 1){

            System.out.print(
                    "Security Question: ");

            user.setSecurityQuestion(
                    scan.nextLine());

            System.out.print(
                    "Answer: ");

            user.setSecurityAnswer(
                    scan.nextLine());

            System.out.println(
                    "Security Details Saved!");
        }
    }

    public static void UserAccount(Scanner scan){
        System.out.println("1.Coninue to Profile: ");
        System.out.println("2.Home");

        System.out.print("Enter your Choice: ");
        int choice = scan.nextInt();
        scan.nextLine();

        if (choice == 1){
            Accounts.Profile(scan);
        }else {
            Home.UserHome(scan);
        }
    }
}