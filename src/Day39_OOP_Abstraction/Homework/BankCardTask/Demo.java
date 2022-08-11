package Day39_OOP_Abstraction.Homework.BankCardTask;

public class Demo {

    /*
    - Create a BankCard parent class (Abstract Class)
         -methods: deposit and withdraw (abstract methods)
         -variable: create as you need(name, ssn...) (use encapsulation)

    - Create two types of cards, credit and debit that extend BankCard class
        -debit card cannot overdraft (while implementing abstract methods do it accordingly)
        -credit card can overdraft (while implementing abstract methods do it accordingly)

-------------------------------------

    create Demo class to check:
        debit card cannot overdraft
        credit card can overdraft
     */
    public static void main(String[] args) {


        BankCard bankCard1 = new DebitCard("John", 111111111);
        bankCard1.deposit(200);
        System.out.println(bankCard1.getBalance());
        bankCard1.withdraw(150);
        System.out.println(bankCard1.getBalance());


        BankCard bankCard2 = new CreditCard("Katy", 222222222);
        bankCard2.deposit(200);
        System.out.println(bankCard2.getBalance());
        bankCard2.withdraw(250);
        System.out.println(bankCard2.getBalance());


    }
}
