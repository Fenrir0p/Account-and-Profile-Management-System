package Account;
import java.util.Scanner;

public class Home {

    public static void UserHome(Scanner scan){

        System.out.println("1. Profile");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Bills");
        System.out.println("5. Transactions");
        System.out.println("6. Settings");
        System.out.println("7. Logout");

        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        scan.nextLine();


        switch (choice){
            case 1:
                Accounts.Profile(scan);
                break;
            case 2:

                break;
        }
    }
}
