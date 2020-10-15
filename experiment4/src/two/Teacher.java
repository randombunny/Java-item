package two;

import java.util.Date;

public class Teacher extends Staff{
    private String department;
    private String speciality;
    private int postAllowancec;

    public Teacher(String department, String speciality, int postAllowancec,String name, String address, int age, boolean sex, int salary, Date dataHired) {
        super(name, address, age, sex, salary, dataHired);
        this.department = department;
        this.speciality = speciality;
        this.postAllowancec = postAllowancec;
    }

    public Teacher() {
        this.department = "";
        this.speciality = "";
        this.postAllowancec = 0;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getPostAllowancec() {
        return postAllowancec;
    }

    @Override
    public int getSalary() {
        return super.getSalary()+this.getPostAllowancec();
    }

    public void setPostAllowancec(int postAllowancec) {
        this.postAllowancec = postAllowancec;
    }
}
