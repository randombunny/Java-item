package two;

import java.util.Date;

public class SecurityGuard extends Staff{
    private String skills;
    private int dangerousAllowance;

    public SecurityGuard(String skills, int dangerousAllowance,String name, String address, int age, boolean sex, int salary, Date dataHired) {
        super(name, address, age, sex, salary, dataHired);
        this.skills = skills;
        this.dangerousAllowance = dangerousAllowance;
    }

    public SecurityGuard() {
        this.skills = "";
        this.dangerousAllowance = 0;

    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getDangerousAllowance() {
        return dangerousAllowance;
    }

    public void setDangerousAllowance(int dangerousAllowance) {
        this.dangerousAllowance = dangerousAllowance;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + this.getDangerousAllowance();
    }
}
package two;

import java.util.Date;

public class SecurityGuard extends Staff{
    private String skills;
    private int dangerousAllowance;

    public SecurityGuard(String skills, int dangerousAllowance,String name, String address, int age, boolean sex, int salary, Date dataHired) {
        super(name, address, age, sex, salary, dataHired);
        this.skills = skills;
        this.dangerousAllowance = dangerousAllowance;
    }

    public SecurityGuard() {
        this.skills = "";
        this.dangerousAllowance = 0;

    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getDangerousAllowance() {
        return dangerousAllowance;
    }

    public void setDangerousAllowance(int dangerousAllowance) {
        this.dangerousAllowance = dangerousAllowance;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + this.getDangerousAllowance();
    }
}
