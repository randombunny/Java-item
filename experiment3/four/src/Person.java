public class Person {
    private String name;
    private int sex;
    private int age;
    private int id;
    private static int count;
    Person(String name,int age){
        this.name = name;
        this.age = age;
        this.sex = 0;
        id = count++ ;
    }
    Person(String name,int age,int sex){
        this(name,age);
        this.setSex(sex);
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSex() {
        return sex;
    }

    public void setAge(int age) {
        if(age<0&&age>140){
            System.out.println("error");
            return;
        }
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(int sex) {
        if(sex!=1&&sex!=0){
            System.out.println("error");
            return ;
        }
        this.sex = sex;
    }
    @Override
    public String toString(){
        return "name:"+this.name+","+"age:"+this.age+","+"sex:"+this.sex+",id:"+this.id;
    }
}
