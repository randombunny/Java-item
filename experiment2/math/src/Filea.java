import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class Filea {
    public static void main(String args[])throws FileNotFoundException{
        int[] smallNum = new int[26];
        int sum = 0;
        String tmp;
        Scanner in = new Scanner(new File("Object.txt"));
        while(in.hasNextLine()){
            tmp = in.nextLine();
            tmp.toLowerCase();
            sum+=tmp.length();
            for(int i = 0;i<tmp.length();i++){
                if(tmp.charAt(i)>='a'&&tmp.charAt(i)<='z')smallNum[tmp.charAt(i)-'a']++;
            }
        }
        for(int i = 0;i<26;i++)
            System.out.format("%c：%d%% ",('a'+i),smallNum[i]*100/sum);

    }
}
