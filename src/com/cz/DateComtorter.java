package com.cz;

import java.util.Date;

public class DateComtorter {
    //时间格式转换

    public static void main(String... ager){
        Date date=new Date();
        String year  = String.format("%tY",date);//年
        String month = String.format("%tm",date);//月
        String day   = String.format("%td",date);//日
        System.out.println(year+"-"+month+"-"+day);
        //年-月-日 2017-09-20
        String tf=String.format("%tF",date);
        System.out.println(tf);
        //月/日/年 09/20/17
        String tf1=String.format("%tD",date);
        System.out.println(tf1);
        //星期三 九月 20 19:39:09 CST 2017
        String tf2=String.format("%tc",date);
        System.out.println(tf2);
        //07:37:38 下午
        String tf3=String.format("%tr",date);
        System.out.println(tf3);

        //19:37:38
        String tf4=String.format("%tT",date);
        System.out.println(tf4);
        //19:37
        String tf5=String.format("%tR",date);
        System.out.println(tf5);


    }
}
