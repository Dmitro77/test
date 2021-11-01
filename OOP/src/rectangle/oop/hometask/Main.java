package rectangle.oop.hometask;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.setRectangleSides(5, 10);
        System.out.println("Периметр прямоугольника - " + rect1.rectanglePerimeter());
        System.out.println("Площадь прямоугольника - " + rect1.rectangleSquare());

    }
}
