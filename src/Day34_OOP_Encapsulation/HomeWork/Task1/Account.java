package Day34_OOP_Encapsulation.HomeWork.Task1;

public class Account {
    /*
    Task1 Homework - ENCAPSULATION
Create a class called Account
private fields -> userId:String, balance:double
userId should be initialized in constructor
create getter and setter methods for balance only
----------------------
in setter method for balance, make sure they cannot set it to negative value (throw an exception)
-----------------------
*requirement userId must not be modified, it's a read-only property

     */

    private double balance;
    private  String userId;

    public Account(String userid) {
        this.userId = userid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0)
            throw new IllegalArgumentException("Balance cannot be less than 0");
       this.balance = balance;
    }
    public String getUserId(){
        return userId;
    }
}
