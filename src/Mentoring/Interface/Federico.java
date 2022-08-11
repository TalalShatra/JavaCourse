package Mentoring.Interface;

public class Federico implements Student{

    int exam1 = 60, exam2 = 91, exam3 = 40, exam4 = 100, exam5 = 0;
    int birthYear = 1986;

    @Override
    public int returnGrade() {
        return (this.exam1 + this.exam2 + this.exam3 + this.exam4 + this.exam5) / 5;
    }

    @Override
    public int returnAge() {
        return 2022 - this.birthYear;
    }
}
