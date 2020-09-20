import java.util.Scanner;
public class Euclidean {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = 0,n = 0;
        if (scan.hasNext()) {
            m = scan.nextInt();
            n = scan.nextInt();
        }
        System.out.println(gcd(m,n));
        System.out.println(gcd_recursive(m,n));

    }
    private static int gcd(int m, int n){
        int tmp =1;
        while(true){
            if(n>m){
                int a = n;
                n = m;
                m = a;
            }
            tmp =m%n;
            if(tmp == 0)return n;
            else{
                m = n;
                n = tmp;
            }
        }
    }
    private static int gcd_recursive(int m, int n){
        if(n>m){
            int a = n;
            n = m;
            m = a;
        }
        if(m%n==0)return n;
        return gcd_recursive(n,m%n);
    }
}
