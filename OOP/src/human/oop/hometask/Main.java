package human.oop.hometask;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Johan", 23, 80);
        Human human2 = new Human("David", 25, 72.5);
        Human human3 = new Human("Abdul", 43, 110);

        Human human4 = new Human("Dima", 25);
        human4.setAge(26);
        human4.showInfo();
        System.out.println(human4.getAge());


        Human[] men = new Human[3];
        men[0] = human1;
        men[1] = human2;
        men[2] = human3;

       /* int sum = 0;
        for (int i = 0; i < men.length; i++) {
            sum += men[i].age;

        }
        System.out.println("Средний возраст - " + sum / (double) men.length);*/

    }
}
