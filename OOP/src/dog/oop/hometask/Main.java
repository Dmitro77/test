package dog.oop.hometask;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Sharik";
        dog1.breed = "Dvorniaga";
        dog1.speed = 2;

        Dog dog2 = new Dog();
        dog2.name = "Adolf";
        dog2.breed = "Dog";
        dog2.speed = 1;

        Dog dog3 = new Dog();
        dog3.name = "Charly";
        dog3.breed = "Shepard ";
        dog3.speed = 3;

        String info1 = dog1.info();
        System.out.println(info1);
        dog1.run();

        String info2 = dog2.info();
        System.out.println(info2);
        dog2.run();

        String info3 = dog3.info();
        System.out.println(info3);
        dog3.run();

    }
}
