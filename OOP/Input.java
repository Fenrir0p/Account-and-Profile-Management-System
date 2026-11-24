import java.util.Scanner;
import Authentication.SignIn;
import Database.AccountInfos;
import Database.AccountStorage;
import Authentication.SignUp;

 class Input {

     static Scanner scan;

     static void main (String []args){

        initializeObjects();
        Menu(scan);
    }

    public static void initializeObjects() {

        scan = new Scanner(System.in);

        SignUp.user = AccountStorage.loadAccount();

        if(SignUp.user != null){
            AccountInfos.loadUserInfos(SignUp.user);
        }

    }

    public static void Menu(Scanner scan){

        System.out.println("1.Sign In");
        System.out.println("2.Sign Up");
        System.out.print("Please enter you choice: ");

        int choice = scan.nextInt();
        scan.nextLine();

        switch(choice){

            case 1:

                SignIn.SignedIn(scan);

                break;

            case 2:

                SignUp.SignedUp(scan);
                break;

            default:
                System.out.println("Invalid choice");

        }
    }
}
