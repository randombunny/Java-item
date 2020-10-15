package four;

public class TestPlainRect {
    public static void main(String[] args){
        PlainRect plainRect1 = new PlainRect();
        System.out.println(plainRect1);
        System.out.println(plainRect1.isInside(1,1));
        PlainRect plainRect2 = new PlainRect(10,10,10,10);
        System.out.println(plainRect2);
        System.out.println(plainRect2.isInside(100,100));
        System.out.println(plainRect2.isInside(10,5));
    }
}
