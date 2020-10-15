import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Student {
    private String name;
    private int math;
    private int java;
    private int ds;
    private int average;
    private int total;
    public Student(String name,int math,int java,int ds){
        this.math = math;
        this.name = name;
        this.java = java;
        this.ds = ds;
        average = 0;
        total = 0;
    }
    public Student(String name,int math,int java,int ds,int average,int total){
        this.math = math;
        this.name = name;
        this.java = java;
        this.ds = ds;
        this.average = average ;
        this.total = total;
    }
    public String getName(){
        return name;
    }
    public int getMath(){
        return math;
    }
    public int getJava(){
        return java;
    }
    public int getDs(){
        return ds;
    }
    public int getAverage() {
        measure();
        return average;
    }
    public int getTotal() {
        measure();
        return total;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAverage(int average) {
        measure();
        this.average = average;
    }
    public void setDs(int ds) {
        this.ds = ds;
    }
    public void setJava(int java) {
        this.java = java;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public void setTotal(int total) {
        measure();
        this.total = total;
    }
    public void setStudent(String tname, int tmath, int tjava, int tds){
        math = tmath;
        name = tname;
        java = tjava;
        ds = tds;
        average = 0;
        total = 0;
    }
    public void setStudent(String tname, int tmath, int tjava, int tds,int taverage,int ttotal){
        math = tmath;
        name = tname;
        java = tjava;
        ds = tds;
        average = taverage;
        total = ttotal;
    }

    private void measure(){
        total = math+java+ds;
        average = total/3;
    }
    public static Student[] readStudentsFromFile(String fileName) throws FileNotFoundException {
        ArrayList<Student> students = new ArrayList<>();
        Scanner in = new Scanner(new File(fileName));
        while(in.hasNextLine()){//判断扫描器是否还有下一行未读取，该循环把文件的每一行都读出
            String line = in.nextLine();//读出myfile.txt的下一行
            Scanner lineScanner = new Scanner(line);//对每一行的内容建立一个扫描器
            lineScanner.useDelimiter(" ");//使用空格作为分隔符
            students.add(new Student(lineScanner.next(),Integer.valueOf(lineScanner.next()),Integer.valueOf(lineScanner.next()),Integer.valueOf(lineScanner.next()),Integer.valueOf(lineScanner.next()),Integer.valueOf(lineScanner.next())));
        }

        in.close();//读入完毕，最后需要对其进行close。
        Student[] tmp = students.toArray(new Student[students.size()]);
        return tmp;
    }
    public static void sort(Student[] students){
        for(int j = 0;j<students.length;j++){
            for(int k = 0;k<students.length - 1;k++){
                if(students[k].total<students[k+1].total){
                    Student tmp = students[k];
                    students[k] = students[k+1];
                    students[k+1] = tmp;
                }
            }
        }
        for(int i = 0;i<students.length;i++)
            System.out.println(students[i]);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", math=" + math +
                ", java=" + java +
                ", ds=" + ds +
                ", average=" + average +
                ", total=" + total +
                '}';
    }
}
