package rectangle.oop.hometask;

public class Rectangle {
    int length;
    int width;

    void setRectangleSides(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int rectanglePerimeter() {
        return (length + width) * 2;
    }

    int rectangleSquare() {
        return length * width;
    }
}
