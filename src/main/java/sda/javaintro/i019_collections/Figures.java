package sda.javaintro.i019_collections;

public class Figures {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        rect.print();
        rect.draw();

        Circle circle = new Circle(10);
        circle.print();

        Triangle triangle = new Triangle(3, 5);
        triangle.print();
        triangle.draw();
    }
}