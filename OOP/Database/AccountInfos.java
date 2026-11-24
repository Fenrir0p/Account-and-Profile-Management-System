package Database;

import PersonalDatas.PersonalInfo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class AccountInfos {
    public static ArrayList<PersonalInfo> users = new ArrayList<>();

    private static final String FILE = "personal-info.txt";

    public static void saveUserInfos(PersonalInfo user) {
        Properties info = new Properties();

        info.setProperty("username", value(user.getUsername()));
        info.setProperty("firstName", value(user.getFirstName()));
        info.setProperty("lastName", value(user.getLastName()));
        info.setProperty("phoneNumber", value(user.getPhoneNumber()));
        info.setProperty("securityQuestion", value(user.getSecurityQuestion()));
        info.setProperty("securityAnswer", value(user.getSecurityAnswer()));
        info.setProperty("setupComplete",
                Boolean.toString(user.isSetUpComplete()));

        try (FileOutputStream out = new FileOutputStream(FILE)) {
            info.store(out, "Saved personal information");
        } catch (IOException e) {
            System.out.println("Error saving personal information: " + e.getMessage());
        }
    }

    public static void loadUserInfos(PersonalInfo user) {
        Properties info = new Properties();

        try (FileInputStream in = new FileInputStream(FILE)) {
            info.load(in);

            user.setUsername(info.getProperty("username", ""));
            user.setFirstName(info.getProperty("firstName", ""));
            user.setLastName(info.getProperty("lastName", ""));
            user.setPhoneNumber(info.getProperty("phoneNumber", ""));
            user.setSecurityQuestion(info.getProperty("securityQuestion", ""));
            user.setSecurityAnswer(info.getProperty("securityAnswer", ""));
            user.setSetUpComplete(Boolean.parseBoolean(
                    info.getProperty("setupComplete", "false")));

        } catch (FileNotFoundException e) {
            // No personal information file exists yet.
        } catch (IOException e) {
            System.out.println("Error loading personal information: " + e.getMessage());
        }
    }

    private static String value(String text) {
        return text == null ? "" : text;
    }
}