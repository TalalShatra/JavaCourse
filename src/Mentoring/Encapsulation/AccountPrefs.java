package Mentoring.Encapsulation;

public class AccountPrefs {
    private String username = "TechnoStudy";
    private String password = "12345asdfg*";

    //public -> accessible from everywhere
    //default -> accessible from the same package
    //private -> accessible from only the same class

    public String getUsername() {
        return username;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        AccountPrefs myAccount = new AccountPrefs();
    }
}
