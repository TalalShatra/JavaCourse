package Day31_OOP_Constructor.Profile;
/*
Create a class called Profile with following attributes:
        String firstName;
        String lastName;
        String address;
        String birthDate;
        String phone;
        String email;
        String nickname;

    -Create a constructor to initialize all attributes
    -Create a constructor to initialize firstName and lastName only
    -Create a constructor to initialize firstName, lastName, birthDate only
    -Create a constructor to initialize nickname only
 */
public class Profile {
    String firstName;
    String lastName;
    String address;
    String birthDate;
    String phone;
    String email;
    String nickname;

    // Constructor 1
    public Profile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Constructor 2
    public Profile(String firstName, String lastName, String birthDate) {
        this(firstName, lastName);  // calling Constructor 1
        this.birthDate = birthDate; // calling a Constructor should be in first Line
    }

    public Profile(String nickname){
        this.nickname = nickname;
    }
    public Profile(String firstName, String lastName, String address, String birthDate, String phone, String email, String nickname) {
        this(firstName, lastName, birthDate); // calling Constructor 2
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.nickname = nickname;         // we can call only 1 Constructor


    }

}


