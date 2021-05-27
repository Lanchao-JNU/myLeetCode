package practice;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: zhanglanchao
 * \* Date: 2021/5/11
 * \* Time: 下午4:46
 * \* Description:
 * \
 */
public class PassObject {

    public static void main(String [] args){
        PassObject obj = new PassObject();

        obj.printAreas(new Circle(),5);
    }

    public void printAreas(Circle c,int time){
        double i=0;
        while (i<=time){
            c.radius = i;
            System.out.println(c.findArea());
            i+=1;
        }
    }
}


class Circle{
    double radius;

    public double findArea(){
        return 3.14*radius*radius;
    }
}