package practice;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/5/12
 * \* Time: 下午12:24
 * \* Description:
 * \
 */
public class Account {
    private double balance;

    public Account (double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amt){
        this.balance+=amt;
    }

    public void withdraw(double amt){
        if(amt<=this.balance){
            this.balance-=amt;
        }else{
            System.out.println("余额不足");
        }
    }

}