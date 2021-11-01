package box;

public class Box {
    public int heigth;
    public int length;
    public int weigth;


    public Box(int heigth, int length, int weigth) {
        this.heigth = heigth;
        this.length = length;
        this.weigth = weigth;
    }

    public Box(Box box1, Box box2) {
        this.heigth = box1.heigth + box2.heigth;
        this.length = box1.length + box2.length;
        this.weigth = box1.weigth + box2.weigth;
    }

    public Box sumBox(Box box) {
        return new Box(this.heigth + box.heigth, this.length + box.length, this.weigth + box.weigth);
    }


    public void showSides() {
        System.out.println("Length: " + length + "\nHeigth: " + heigth + "\nWeigth: " + weigth);
    }

    public void showVolume() {
        int volume = this.heigth * this.length * this.weigth;
        System.out.println("Volume = " + volume);
    }

    public void setHeigth(int heigth) {
        if (heigth > 0) {
            this.heigth = heigth;
        } else {
            System.out.println("Высота коробки должна быть больше ноля");
        }
    }

    public int getHeigth() {
        return heigth;
    }


}