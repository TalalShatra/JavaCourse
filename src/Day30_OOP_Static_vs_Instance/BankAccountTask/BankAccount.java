package Day30_OOP_Static_vs_Instance.BankAccountTask;

public class BankAccount {

    String customerName;
    double customerBalance = 0;

    static double bankBalance = 0;

    void deposit(double depositValue){
        customerBalance += depositValue;
        bankBalance += depositValue;
    }


    void withdraw(double withdrawValue){
        customerBalance -= withdrawValue;
        bankBalance -= withdrawValue;
    }
}
