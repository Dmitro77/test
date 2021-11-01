package human.oop.hometask;

public class Human {
    private String name;
    private int age;
    public double weight;

    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void showInfo() {
        System.out.println("Имя:" + name + "\nВозраст: " + age);
    }

    public void setAge(int age) {
        if (age > 0) {

            this.age = age;
        } else {
            System.out.println("Возраст не может быть меньше 0");
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
