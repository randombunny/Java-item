import java.util.Scanner;

public class TestQuadraticEquation {

    public static void main(String[] args) {
        double a,b,c;
        System.out.println("Pleace input a,b,c(Separated by blank)");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.getDiscriminant());
        if(quadraticEquation.getDiscriminant()==0)
            System.out.println(quadraticEquation.getRoot1());
        else if(quadraticEquation.getDiscriminant()<0)
            System.out.println("The equation has no roots.");
        else {
            System.out.println("root1:"+quadraticEquation.getRoot1());
            System.out.println("root1:"+quadraticEquation.getRoot2());
        }
    }
}
