package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        cat.run(200);

        Dog dog = new Dog("Дидиен");
        dog.run(500);
        dog.swim(10);

    }
}
