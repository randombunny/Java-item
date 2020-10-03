import java.util.Random;

public class Student {
    private String name;
    private int math;
    private int java;
    private int ds;
    private int average;
    private int total;
    public Student(){
        name = "";
        math = java = ds = average = total = 0;
    }
    public Student(int flag){
        math = (int)(Math.random()*100);
        name = "张三"+String.valueOf((int)(Math.random()*100));
        java = (int)(Math.random()*100);
        ds = (int)(Math.random()*100);
        average = 0;
        total = 0;
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
        return average;
    }

    public int getTotal() {
        return total;
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
    public void measure(){
        total = math+java+ds;
        average = total/3;
    }
}
