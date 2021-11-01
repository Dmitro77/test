package monster.oop.hometsk;

public class Main {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        monster1.voice();
        Monster monster2 = new Monster(4);
        Monster monster3 = new Monster(4, 6);
        monster3.voice(2);
        Monster monster4 = new Monster(4, 6, 8);
        monster4.voice(3, "Vargh!!!!");
    }
}
