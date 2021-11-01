package monster.oop.hometsk;

public class Monster {
    int numberOfYey;
    int numberOflegs;
    int numberOfArms;


    Monster() {
        this.numberOfYey = 2;
        this.numberOflegs = 2;
        this.numberOfArms = 2;
    }

    Monster(int numberOfYey) {
        this.numberOfYey = numberOfYey;
        this.numberOflegs = 2;
        this.numberOfArms = 2;
    }

    Monster(int numberOfYey, int numberOflegs) {

        this.numberOfArms = 2;
    }

    Monster(int numberOfYey, int numberOflegs, int numberOfArms) {

    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int i) {
        for (int j = 0; i > j; j++) {
            System.out.println("Голос");
        }
    }

    void voice(int i, String word) {
        for (int j = 0; i > j; j++) {
            System.out.println(word);
        }
    }
}