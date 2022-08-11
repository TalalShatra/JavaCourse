package Day30_OOP_Static_vs_Instance.BankAccountTask;

public class MainBankAccount {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.customerName = "Talal";

        bankAccount1.deposit(550);

        System.out.println(bankAccount1.customerBalance);

        bankAccount1.withdraw(125);

        System.out.println(bankAccount1.customerBalance);




        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.customerName = "Sina";

        bankAccount2.deposit(725);

        System.out.println(bankAccount2.customerBalance);

        bankAccount2.withdraw(125);

        System.out.println(bankAccount2.customerBalance);

        System.out.println(BankAccount.bankBalance);





    }
}
