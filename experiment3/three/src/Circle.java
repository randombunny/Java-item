public class Circle {
    private double r;
    Circle(){
        this.r = Math.random()*10;
    }
    public double getPerimeter(){
        return 2*Math.PI*r;
    }
    public double getArea(){
        return Math.PI*r*r;
    }
}
