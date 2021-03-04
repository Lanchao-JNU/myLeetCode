package Topic.Test;

import util.ListNode;

import java.util.ArrayList;

public class TopicsTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        ListNode node = new ListNode();
        ListNode res = node.ArraytoListNode(array);
        ArrayList <Object> list= node.ListNodetoArrayList(res);
        System.out.println(list);

        String DaySql = "SELECT\n" +
                "month_time AS dateTime\n" +
                ",app_name as appName\n"+
                ",sum(regist_user_new) AS registerUserNum\n" +
                ",if(sum(regist_user_new)=0,0,round(100*sum(regist_user_2month)/sum(regist_user_new),2))  AS registerUser2PeriodRate\n" +
                ",if(sum(regist_user_new)=0,0,round(100*sum(regist_user_3month)/sum(regist_user_new),2))  AS registerUser3PeriodRate\n" +
                ",if(sum(regist_user_new)=0,0,round(100*sum(regist_user_4month)/sum(regist_user_new),2)) AS registerUser4PeriodRate\n" +
                ",if(sum(regist_user_new)=0,0,round(100*sum(regist_user_5month)/sum(regist_user_new),2))  AS registerUser5PeriodRate\n" +
                ",if(sum(regist_user_new)=0,0,round(100*sum(regist_user_6month)/sum(regist_user_new),2))  AS registerUser6PeriodRate\n" +
                "from dm_app_ad_login_info_month\n";
        System.out.println(DaySql);
    }

}
