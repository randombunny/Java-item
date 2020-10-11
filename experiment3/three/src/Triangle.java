public class Triangle {
    private double a;
    private double b;
    private double c;
    Triangle(){
        this.a = Math.random()*10 +5;
        this.b = a-1;
        this.c = a-2;
    }
    public double getPerimeter(){
        return a+b+c;
    }
    public double getArea(){
        return 0.25*Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a));
    }
}
