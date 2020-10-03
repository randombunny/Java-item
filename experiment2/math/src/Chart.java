import java.util.Scanner;
import java.lang.Math;

public class Chart  {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        if(in.hasNext()){
            n = in.nextInt();
        }
        in.close();
        char[] array = new char[n];
        for(int i = 0;i<n;i++){
            array[i] = (char)('a' + Math.random() * 26);
        }
        int[] num = new int[26];
        for(char element:array){
            num[element-'a']++;
        }
        for(int i = 0;i<26;i++)
            System.out.format("%c：%d%% ",('a'+i),num[i]*100/n);
    }
}
