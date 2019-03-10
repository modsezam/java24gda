package sda.javaintro.i019_collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTest {

    public static void main(String[] args) {

        List<Circle> circles = new ArrayList<>();
        List<Triangle> triangles = new ArrayList<>();
        List<Rectangle> rectangles = new ArrayList<>();

        circles.add(new Circle(1));
        circles.add(new Circle(2));
        circles.add(new Circle(3));

        triangles.add(new Triangle(1,2));
        triangles.add(new Triangle(2,2));
        triangles.add(new Triangle(3,3));

        rectangles.add(new Rectangle(1,1));
        rectangles.add(new Rectangle(2,2));
        rectangles.add(new Rectangle(3,3));


        for (int i = 0; i < circles.size(); i++){
            System.out.println("koło obwód " + i + " = " + circles.get(i).getPerimeter() );
            System.out.println("koło pole " + i + " = " + circles.get(i).getArea() );
        }

        for (int i = 0; i < triangles.size(); i++){
            System.out.println("trójkąt obwód " + i + " = " + triangles.get(i).getPerimeter() );
            System.out.println("trójkąt pole " + i + " = " + triangles.get(i).getArea() );
        }

        for (int i = 0; i < rectangles.size(); i++){
            System.out.println("kwadrat obwód " + i + " = " + rectangles.get(i).getPerimeter() );
            System.out.println("kwadrat pole " + i + " = " + rectangles.get(i).getArea() );
        }

        //wszystko u góry wsadzić w List<Figure>
        List<Figure> figures = new ArrayList<>();

//        figures.add((Figure) rectangles.get(0));
//        figures.add((Figure) triangles);
//        figures.add((Figure) rectangles);








    }


}
