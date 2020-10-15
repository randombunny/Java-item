package one;

import java.util.ArrayList;

public class TestShape {
    public static void main(String[] args){
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Triangle());
        shapes.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Rectangle());
        double area = 0,perimeter = 0;
        for(Shape element : shapes){
            area+= element.getArea();
            perimeter+=element.getPerimeter();
        }
        System.out.println("Area:"+area);
        System.out.println("Perimenter:"+perimeter);
    }
}
