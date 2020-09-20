import java.util.Scanner;
public class Sieve {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        if (scan.hasNext()) {
            i = scan.nextInt();
        }
        printPrimeNumbers(getPrimeNumbers(i));
    }
    public static int[] getPrimeNumbers(int n){
        int num = 0;
        int[] result = new int[n];
        for(int i = 0;i<result.length;i++){
            result[i] = i+1;
        }
        result[0] = -1;
        for(int i = 1;i<result.length;i++){
            if(result[i]!=-1){
                num++;
                for(int j = 2;(i+1)*j-1<result.length;j++){
                    result[(i+1)*j-1] = -1;
                }
            }
        }
        int[] tmp = new int[num];
        int j = 0;
        for(int i = 0;i<n&&j<num;i++){
            if(result[i]!=-1)tmp[j++] = result[i];
        }
        result = tmp;
        return result;

    }
    public static void printPrimeNumbers(int[] n){
        for(int i = 0;i<n.length;i++)System.out.println(n[i]);
    }
}