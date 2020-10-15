package two;

import java.util.Date;

public class Staff {
    private String name;
    private String address;
    private int age;
    private boolean sex;
    private int salary;
    private Date dataHired;

    public Staff(String name, String address, int age, boolean sex, int salary, Date dataHired) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.dataHired = dataHired;
    }

    public Staff() {
        this.name = "";
        this.address = "";
        this.age = 0;
        this.sex = false;
        this.salary = 0;
        this.dataHired = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDataHired() {
        return dataHired;
    }

    public void setDataHired(Date dataHired) {
        this.dataHired = dataHired;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", salary=" + salary +
                ", dataHired=" + dataHired +
                '}';
    }
}
