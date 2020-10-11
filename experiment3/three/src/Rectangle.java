public class Rectangle {
    private double a;
    private double b;
    Rectangle(){
        this.a = Math.random()*10;
        this.b = Math.random()*10;
    }
    public double getPerimeter(){
        return (this.a+this.b)*2;
    }
    public double getArea(){
        return a*b;
    }
}
