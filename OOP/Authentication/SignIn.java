package Authentication;

import Account.Home;
import PersonalDatas.PersonalInfo;
import Setup.SettingUp;
import java.util.Scanner;

public class SignIn {

    public static PersonalInfo currentUser;

    public static void SignedIn(Scanner scan) {

        if(SignUp.user == null){
            System.out.println(
                    "Please Create an Account First"
            );
            return;
        }

        boolean loggedIn = false;

        while(!loggedIn){

            System.out.print(
                    "Enter Gmail: "
            );

            String userInput =
                    scan.nextLine();

            PersonalInfo user =
                    SignUp.user;

            if(!userInput.equals(
                    user.getGmail()))
            {
                System.out.println(
                        "Account Does not Exist"
                );
                continue;
            }

            System.out.print(
                    "Enter Password: "
            );

            String password =
                    scan.nextLine();

            if(!password.equals(
                    user.getPassword()))
            {
                System.out.println(
                        "Wrong Password!"
                );
            }
            else{

                System.out.println(
                        "Welcome!!"
                );

                loggedIn = true;

                currentUser = user;

                if(!currentUser.isSetUpComplete()){

                    SettingUp.SetUp(scan);

                }
                else{

                    Home.UserHome(scan);

                }
            }
        }
    }
}
