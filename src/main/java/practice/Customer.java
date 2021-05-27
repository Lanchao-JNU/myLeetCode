package practice;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/5/12
 * \* Time: 下午12:28
 * \* Description:
 * \
 */
public class Customer {

    private String firstName;

    private String lastName;

    private Account account;

    public Customer(){

    }

    public Customer(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Account getAccount(){
        return this.account;
    }

    public void setAccount(Account account){
        this.account = account;
    }
}