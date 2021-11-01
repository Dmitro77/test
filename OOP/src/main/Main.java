package main;


import box.Box;
import test.MyMath;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box(10, 10, 10);
        box1.setHeigth(20);
        System.out.println(box1.getHeigth());
        Box box2 = box1.sumBox(box1);


        //  box2.showSides();
        Box box3 = new Box(box1, box2);
        box3.showSides();
        box3.showVolume();


        System.out.println(MyMath.square(20));
        System.out.println(MyMath.length(10));

        int sum = MyMath.sum(1,3,1312,43233);
        System.out.println(sum);

    }
}
