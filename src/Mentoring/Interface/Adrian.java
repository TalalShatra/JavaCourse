package Mentoring.Interface;

public class Adrian implements Student{
    int exam1 = 80, exam2 = 90, exam3 = 10;
    int birthYear = 1986;

    @Override
    public int returnGrade() {
        return (this.exam1 + this.exam2 + this.exam3) / 3;
    }

    @Override
    public int returnAge() {
        return 2022 - this.birthYear;
    }

    public static void main(String[] args) {
        Adrian obj = new Adrian();

        System.out.println(obj.returnGrade());
        System.out.println(obj.returnAge());
    }
}
