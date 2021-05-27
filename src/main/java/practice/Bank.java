package practice;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.HashMap;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/5/12
 * \* Time: 下午12:32
 * \* Description:
 * \
 */
public class Bank {

    private Customer[] customers;

    private int numOfCustomer;

    public Bank(){
        this.customers = new Customer[10];
        HashMap<Integer [],String> map = new HashMap<Integer[], String>();


    }

    public void addCustomer(String firstName,String lastName){
        Customer customer = new Customer(firstName,lastName);
        this.customers[numOfCustomer] = customer;
        this.numOfCustomer+=1;
    }

    public int  getNumOfCustomer(){
        return numOfCustomer;
    }

    public Customer getCustomer(int index){
        if(index>=0 && index<this.numOfCustomer){
            return this.customers[index];
        }else{
            System.out.println("用户不存在");
            return null;
        }
    }
}