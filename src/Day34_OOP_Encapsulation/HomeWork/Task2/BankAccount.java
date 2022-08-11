package Day34_OOP_Encapsulation.HomeWork.Task2;

import java.util.Currency;

public class BankAccount {
    /*
    Task2 Homework - ENCAPSULATION
Create an enum Currency, with values: USD, EUR
-----------------------
Create a class called bank account, with fields:
userId: string -> readonly
balance: double -> readonly
currency: Currency -> readonly
-----------------------
create a constructor with userId and currency only
-----------------------
create withdraw and deposit methods,
make sure you cannot go to negative balance, else throw an exception (you should not be able to withdraw more than your balance)
     */
    private String userId;
    private double balance;
    private Currency currency;


    public BankAccount(String userId, Currency currency) {
        this.userId = userId;
        this.currency = currency;
    }

    public void deposit(double depositMoney) {
        balance += depositMoney;
    }

    void withdraw(double withdrawMoney) {
        if (withdrawMoney > balance)
            throw new IllegalArgumentException("you should not be able to withdraw more than your balance");
        balance -= withdrawMoney;
    }

}
