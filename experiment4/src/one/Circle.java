package one;

import java.util.Objects;

public class Circle extends Shape{
    private double r;
    Circle(){
        this.r = Math.random()*10;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPerimeter(){
        return 2*Shape.PI*r;
    }
    public double getArea(){
        return Shape.PI*r*r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }

    @Override
    public String toString() {
        return "one.Circle{" +
                "r=" + r +
                '}';
    }
}
