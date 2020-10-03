import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	    birthFile();
        measure();
        high();
        for(String tmp:findStudent ("张三20")){
            System.out.println(tmp);
        }
    }

    public static void birthFile() throws FileNotFoundException{
        //写入文件演示
        PrintWriter out = new PrintWriter("myfile.txt");
        out.println("姓名 高数 Java 数据结构 平均成绩 总成绩");
        for(int i = 0;i<10000;i++) {
            Student student = new Student(1);
            out.println(student.getName()+" "+student.getMath()+" "+student.getJava()+" "+student.getDs()+" "+student.getAverage()+" "+student.getTotal());
        }
        out.close();//输出完毕，需要close
    }

    public static void measure()throws FileNotFoundException{
        Scanner in = new Scanner(new File("myfile.txt"));//为myfile.txt这个File创建一个扫描器in
        in.nextLine();
        PrintWriter out = new PrintWriter("tmp.txt");
        out.println("姓名 高数 Java 数据结构 平均成绩 总成绩");
        while(in.hasNextLine()){//判断扫描器是否还有下一行未读取，该循环把文件的每一行都读出
            String line = in.nextLine();//读出myfile.txt的下一行
            Scanner lineScanner = new Scanner(line);//对每一行的内容建立一个扫描器
            lineScanner.useDelimiter(" ");//使用空格作为分隔符
            Student student = new Student();
            student.setStudent(lineScanner.next(),Integer.valueOf(lineScanner.next()),Integer.valueOf(lineScanner.next()),Integer.valueOf(lineScanner.next()));
            student.measure();
            out.println(student.getName()+" "+student.getMath()+" "+student.getJava()+" "+student.getDs()+" "+student.getAverage()+" "+student.getTotal());
        }
        in.close();//读入完毕，最后需要对其进行close。
        out.close();
        File del = new File("myfile.txt");
        del.delete();
        File oldName = new File("tmp.txt");
        File newName = new File("myfile.txt");
        oldName.renameTo(newName);

    }

    public static void high()throws FileNotFoundException{
        Student[] students = new Student[10000];
        for (int i = 0;i<10000;i++){
            students[i] = new Student();
        }
        Student student = new Student();
        Scanner in = new Scanner(new File("myfile.txt"));//为myfile.txt这个File创建一个扫描器in
        in.nextLine();
        int k = 0;
        while(in.hasNextLine()){//判断扫描器是否还有下一行未读取，该循环把文件的每一行都读出
            String line = in.nextLine();//读出myfile.txt的下一行
            Scanner lineScanner = new Scanner(line);//对每一行的内容建立一个扫描器
            lineScanner.useDelimiter(" ");//使用空格作为分隔符
            students[k++].setStudent(lineScanner.next(),Integer.valueOf(lineScanner.next()),Integer.valueOf(lineScanner.next()),Integer.valueOf(lineScanner.next()),Integer.valueOf(lineScanner.next()),Integer.valueOf(lineScanner.next()));
       }
        Arrays.sort(students, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        if(o1.getAverage() == o2.getAverage())return 0;
                        else return o1.getAverage() > o2.getAverage() ? -1:1;
                    }
        });
        in.close();//读入完毕，最后需要对其进行close。
        PrintWriter out = new PrintWriter("first_10.txt");
        out.println("姓名 高数 Java 数据结构 平均成绩 总成绩");
        for(int i = 0;i<10;i++)out.println(students[i].getName()+" "+students[i].getMath()+" "+students[i].getJava()+" "+students[i].getDs()+" "+students[i].getAverage()+" "+students[i].getTotal());
        out.close();
    }

    public static String[] findStudent(String name) throws FileNotFoundException{
        ArrayList<String> students= new ArrayList<String>();
        int k = 0;
        Scanner in = new Scanner(new File("myfile.txt"));//为myfile.txt这个File创建一个扫描器in
        in.nextLine();
        while(in.hasNextLine()){//判断扫描器是否还有下一行未读取，该循环把文件的每一行都读出
            String line = in.nextLine();//读出myfile.txt的下一行
            Scanner lineScanner = new Scanner(line);//对每一行的内容建立一个扫描器
            lineScanner.useDelimiter(" ");//使用空格作为分隔符
            if(lineScanner.next().equals(name)){
                students.add(line);
                k++;
            }
        }
        in.close();//读入完毕，最后需要对其进行close。
        String[] std = new String[k];
        for(int i = 0;i<k;i++){
            std[i] = students.get(i);
        }
        return std;
    }

}
