package two;

import java.util.Date;

public class Dean extends Teacher{
    private int adminAward;

    public Dean() {
        this.adminAward = 0;
    }

    public Dean(int adminAward,String department, String speciality, int postAllowancec,String name, String address, int age, boolean sex, int salary, Date dataHired) {
        super(department, speciality, postAllowancec,name, address, age, sex, salary, dataHired);
        this.adminAward = adminAward;
    }

    public int getAdminAward() {
        return adminAward;
    }

    public void setAdminAward(int adminAward) {
        this.adminAward = adminAward;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + this.getAdminAward();
    }
}
