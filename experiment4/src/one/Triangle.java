package one;

import java.util.Objects;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;
    Triangle(){
        this.a = Math.random()*10 +5;
        this.b = a-1;
        this.c = a-2;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getPerimeter(){
        return a+b+c;
    }
    public double getArea(){
        return 0.25*Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.a, a) == 0 &&
                Double.compare(triangle.b, b) == 0 &&
                Double.compare(triangle.c, c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "one.Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
