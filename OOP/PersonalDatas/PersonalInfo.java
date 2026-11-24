package PersonalDatas;

public class PersonalInfo {

    private String gmail;
    private String password;

    private String username;
    private String firstName;
    private String lastName;
    private String SecurityQuestion;
    private String SecurityAnswer;
    private String PhoneNumber;
    private boolean SetUpComplete = false;


    public PersonalInfo(String gmail,
                        String password) {

        this.gmail = gmail;
        this.password = password;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail){
        this.gmail = gmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSecurityQuestion(String SecurityQuestion) {
        this.SecurityQuestion = SecurityQuestion;
    }

    public String getSecurityQuestion() {
        return SecurityQuestion;
    }

    public void setSecurityAnswer(String SecurityAnswer) {
        this.SecurityAnswer = SecurityAnswer;
    }

    public String getSecurityAnswer() {
        return SecurityAnswer;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setSetUpComplete(boolean SetUpComplete) {
        this.SetUpComplete = SetUpComplete;
    }

    public boolean isSetUpComplete() {
        return SetUpComplete;
    }
}