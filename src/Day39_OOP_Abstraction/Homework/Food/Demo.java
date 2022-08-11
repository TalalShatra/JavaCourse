package Day39_OOP_Abstraction.Homework.Food;

public class Demo {
    public static void main(String[] args) {
        Sweet sweet1 = new Baklava();
        sweet1.madeIn();
        sweet1.taste();

        Sweet sweet2 = new CheeseCake();
        sweet2.madeIn();
        sweet2.taste();

        Salad salad1 = new GreekSalad();
        salad1.madeIn();
        salad1.taste();

        Salad salad2 = new CaesarSalad();
        salad2.madeIn();
        salad2.taste();




    }

}