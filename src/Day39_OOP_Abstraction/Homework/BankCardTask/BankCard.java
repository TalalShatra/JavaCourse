package Day39_OOP_Abstraction.Homework.BankCardTask;

public abstract class BankCard {


    private String name;
    private int SSN;
    private double balance =0;

    public BankCard(String name, int ssn){
      this.name = name;
      this.SSN = ssn;
}

    public String getName() {
        return name;
    }

    public int getSSN() {
        return SSN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double moneyToDeposit);

    public abstract void withdraw(double moneyToWithdraw);


}
