package Mentoring.Abstract;

public class Siri extends BankUser{

    public Siri(int debt, int minimumPayment, int creditScore) {
        super(debt, minimumPayment, creditScore);
    }

    @Override
    int returnMonthRequiredToPayOff() {
        return 0;
    }
}
