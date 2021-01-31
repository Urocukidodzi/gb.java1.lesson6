package lesson6;

public class Main {


    public static void main(String[] args) {


    Dog barsik = new Dog("Barsik");
    Dog shavka = new Dog();

    Cat murka = new Cat("Murka");
    Cat pushok = new Cat("Pushok");


    barsik.run(100);
    shavka.run(700);

    murka.run(100);
    pushok.run(250);


    barsik.swim(5);
    shavka.swim(100);

    murka.swim(0);
    pushok.swim(5);


    System.out.println(Cat.count);
    System.out.println(Dog.count);
    System.out.println(Animals.count);

    }
}
