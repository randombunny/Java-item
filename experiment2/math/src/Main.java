import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = 0;
	if(in.hasNext()){
	    n = in.nextInt();
    }
	in.close();
	int[] array = new int[n];
	for(int i = 0;i<n;i++){
	    array[i] = (int)(2000+Math.random()*1000);
    }
	int big = 0,small = 0;
	for(int element:array){
	    if(element>2500)big++;
	    else small++;
	}
        System.out.format("大于2500占比：%d%%",big*100/n);
        System.out.format("小于2500占比：%d%%",small*100/n);
    }
}
