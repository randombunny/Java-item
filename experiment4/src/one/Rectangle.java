package one;

import java.util.Objects;

public class Rectangle extends Shape{
    private double length;
    private double width;
    Rectangle(){
        this.length = Math.random()*10;
        this.width = Math.random()*10;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter(){
        return (this.length +this.width)*2;
    }
    public double getArea(){
        return length * width;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0 &&
                Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public String toString() {
        return "one.Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
