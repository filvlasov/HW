/**
 * Java. Level 1. Lesson 7. Homework
 *
 * @author Philipp Vlasov
 * @version dated Oct 05, 2018
 */

class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    void eat(Plate plate) {
        if (plate.getFood() - appetite >= 0 && hungry) {
            plate.dicreaseFood(appetite);
            this.hungry = false;
        }
    }

    @Override
    public String toString() {
        return name + " is hungry. - " + hungry;
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    void dicreaseFood(int food) {
        if (this.food - food >= 0)
            this.food -= food;
    }

    void increaseFood(int food) {
        this.food += food;
    }

    int getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "Food: " + food;
    }
}

public class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cat = {new Cat("Barsik", 10),
                new Cat("Fluffy", 5),
                new Cat("Murzik", 4)};
        Plate plate = new Plate(20);
        System.out.println(plate);
        for (int i = 0; i < 10; i++) {
            cat[i].eat(plate);
            System.out.println(cat[i]);

        }
        System.out.println(plate);
        plate.increaseFood(10);
        System.out.println(plate);
    }
}
