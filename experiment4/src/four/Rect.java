package four;

public class Rect {
    protected double height;
    protected double width;

    public Rect(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rect() {
        this.height = 10;
        this.width = 10;
    }

    public double getArea(){
        return this.height*this.width;
    }

    public double getPerimeter(){
        return (this.height+this.width)*2;
    }

}
