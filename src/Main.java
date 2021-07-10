import animals.*;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog(500, 10, 0.5);
        System.out.println("animals.Dog run " + dog.run(120));
        System.out.println("animals.Dog jump " + dog.jump(1));
        System.out.println("animals.Dog swim " + dog.swim(10));

        System.out.println("\t");

        Cat cat = new Cat(200, 0, 2);
        System.out.println("animals.Cat run " + cat.run(100));
        System.out.println("animals.Cat jump " + cat.jump(1));
        System.out.println("animals.Cat swim " + cat.swim(10));

    }
}
