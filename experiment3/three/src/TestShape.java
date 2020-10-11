public class TestShape {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(),rectangle2 = new Rectangle();
        Triangle triangle1 = new Triangle(), triangle2 = new Triangle();
        Circle circle1 = new Circle(), circle2 = new Circle();
        System.out.println(rectangle1.getArea()+rectangle2.getArea()+triangle1.getArea()+triangle2.getArea()+circle1.getArea()+circle2.getArea());
        System.out.println(rectangle1.getPerimeter()+rectangle2.getPerimeter()+triangle1.getPerimeter()+triangle2.getPerimeter()+circle1.getPerimeter()+circle2.getPerimeter());
    }
}
