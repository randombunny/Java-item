package three;

import java.util.Date;

public class Account {
    private String username;
    protected double balance;
    private double rate;
    private Date accountOpeningDate;

    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }

    public double getRate() {
        return rate;
    }

    public Date getAccountOpeningDate() {
        return accountOpeningDate;
    }

    Account(){
        this.balance = 0;
        this.accountOpeningDate = new Date();
        this.rate = 0;
        this.username = "";
    }
    public Account(String username, double balance, double rate, Date accountOpeningDate) {
        this.username = username;
        this.balance = balance;
        this.rate = rate;
        this.accountOpeningDate = accountOpeningDate;
    }

    public boolean deposit(double money){
        if(money<0){
            System.out.println("deposit false");
            return false;
        }
        this.balance+=money;
        System.out.println("deposit success");
        return true;
    }
    public boolean withdraw(double money){
        if(money>this.balance||money<0){
            System.out.println("withdraw false");
            return false;
        }
        this.balance-=money;
        System.out.println("withdraw successs");
        return true;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", balance=" + balance +
                ", rate=" + rate +
                ", accountOpeningDate=" + accountOpeningDate +
                '}';
    }
}
