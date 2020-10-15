package three;

import java.util.Date;

public class TestAccount {
    public static void main(String[] args){
        Account[] accounts = new Account[3];
        accounts[0] = new Account("张三",0,0,new Date());
        accounts[1] = new SavingAccount("张三",0,0,new Date());
        accounts[2] = new CheckingAccount("张三",0,0,new Date());
        for(int i = 0;i<3;i++){
            System.out.println(accounts[i]);
            accounts[i].deposit(-1);
            accounts[i].withdraw(-1);
            accounts[i].withdraw(100);
            accounts[i].deposit(1000);
            accounts[i].withdraw(1000);
            System.out.println("***************");
        }

    }
}
