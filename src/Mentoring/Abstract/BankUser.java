package Mentoring.Abstract;
//Create an abstract class called BankUser and put variables debt, minimumPayment, creditScore
//Create an abstract method called returnMonthRequiredToPayOff
//And create a regular method called returnDebt
//returnDebt method should just return the debt value of the user
public abstract class BankUser {
    int debt, minimumPayment, creditScore;

    public BankUser(int debt, int minimumPayment, int creditScore) {
        this.debt = debt;
        this.minimumPayment = minimumPayment;
        this.creditScore = creditScore;
    }

    abstract int returnMonthRequiredToPayOff();

    int returnDebt(){
        return this.debt;

        //Create 2 classes for 2 different users and extend BankUser Class
        //Set the debt, minimum payment and creditScore variables in those classes

        //returnMonthRequiredToPayOff method should return
        //how many month it takes the user to pay off the debt by paying minimum payment
        //if the user has a credit score over 700 just divide debt by minimum payment and return
        //if the user has a credit score lower than 700 multiply the debt by 2 and then divide it by the minimum payment
        //NOTE: don't use if statement to decide this, check it manually and write the code depending on the user's credit score
    }



}
