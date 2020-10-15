package three;

import java.util.Date;

public class CheckingAccount extends Account{
    public CheckingAccount(String username, double balance, double rate, Date accountOpeningDate) {
        super(username, balance, rate, accountOpeningDate);
    }

    @Override
    public boolean withdraw(double money){
        if(money>super.getBalance()+1000||money<0){
            System.out.println("withdraw false");
            return false;
        }
        this.balance-=money;
        System.out.println("withdraw successs");
        return true;
    }

}
