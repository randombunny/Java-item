import jdk.nashorn.internal.ir.CallNode;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String str = in.nextLine();
	    String[] strs = str.split(" ");
	    for(int i = 0;i<strs.length;i++){
	        strs[i] = new String(getBirthDate(strs[i]));
        }
	    Arrays.sort(strs);
	    for(int k = 0;k<strs.length;k++) {
            System.out.println(strs[k]);
        }
    }
    public static String getBirthDate(String id){
        id = id.substring(6,10)+"-"+id.substring(10,12)+"-"+id.substring(12,14);
        return id;
    }
}
