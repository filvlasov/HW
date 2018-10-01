/**
 * Java. Level 1. Lesson 6. Homework
 *
 * @author Philipp Vlasov
 * @version dated Oct 01, 2018
 */

/**
 * 1 Создать классы Собака и Кот с наследованием от класса Животное.
 * 2 Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве
 * параметра каждому методу передается величина, означающая или длину препятствия (для
 * бега и плавания), или высоту (для прыжков).
 * 3 У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот
 * 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
 * 4 При попытке животного выполнить одно из этих действий, оно должно сообщить результат в
 * консоль. (Например, dog1.run(150); -> результат: run: true)
 */
abstract class Animal {

    abstract void run(int a);

    abstract void jump(int b);

    abstract void swim(int c);
}

class Cat extends Animal {

    @Override
    void run(int a) {
        System.out.println("cat run: " + (a <= 200));
    }

    @Override
    void jump(int b) {
        System.out.println("cat jump: " + (b <= 2));
    }

    @Override
    void swim(int c) {
        System.out.println("cat swim: " + (c != c));
    }
}

class Dog extends Animal {
    @Override
    void run(int a) {
        System.out.println("dog run: " + (a <= 500));
    }

    @Override
    void jump(int b) {
        System.out.println("dog jump: " + (b <= 0.5));
    }

    @Override
    void swim(int c) {
        System.out.println("dog swim: " + (c <= 10));
    }
}

public class HomeWork6 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        c.run(2);
        d.run(20);
        c.jump(2);
        d.jump(2);
        c.swim(2);
        d.swim(10);

    }
}

