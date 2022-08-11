package Mentoring.Abstract;

public class Alexa extends BankUser{


    public Alexa(int debt, int minimumPayment, int creditScore) {
        super(debt, minimumPayment, creditScore);
    }

    @Override
    int returnMonthRequiredToPayOff() {
        return 0;
    }
}
