package Database;

import PersonalDatas.PersonalInfo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class AccountStorage {

    public static ArrayList<PersonalInfo> users =
            new ArrayList<>();

    public static void saveAccount(PersonalInfo user) {

        try {

            FileWriter writer = new FileWriter("account.txt");

            writer.write(user.getGmail() + "\n");
            writer.write(user.getPassword());

            writer.close();

        } catch(IOException e) {

            System.out.println("Error Saving File");

        }
    }

    public static PersonalInfo loadAccount() {

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("account.txt")
                    );

            String gmail = reader.readLine();
            String password = reader.readLine();

            reader.close();

            return new PersonalInfo(
                    gmail,
                    password
            );

        } catch(IOException e) {

            return null;

        }
    }

}