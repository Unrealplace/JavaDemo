package com.oliver;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 下午9:52 2017/10/24
 * @Modified By:
 */
public  class Main {


    public static void main(String[] args) {

        Employee e1 = new Employee("oliver",11111);
        Employee e2 = new Employee("json",44444);

        if (e1.compareTo(e2)>0){
            System.out.print("e1>e2");
        }else {
            System.out.print("e1<e2");
        }

        try {
            Employee e3 = e2.clone();
            if (e2.getName().equals(e3.getName()))System.out.print("clone object success");
            e3.setSalary(99999999);
            System.out.print(e2.getSalary()+"-----"+e3.getSalary());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        /**
         * 测试回调的使用
         */
        PeopleLi li = new PeopleLi();
        PeopleWang wang = new PeopleWang(li);
        wang.askQuestion("1+1=?");


        /**
         * 测试内部类的使用,下面这种用法前提是TimPriter要是公有类
         */

        TalkIngClock clock2 = new TalkIngClock(1000,false);
        TalkIngClock.TimePrinter listenner = clock2.new TimePrinter();
        listenner.setInnerTime(9999);
        System.out.print(listenner.getInnerTime());



        TalkIngClock clock = new TalkIngClock(1000,true);
        clock.start();
        JOptionPane.showMessageDialog(null,"quit program?");
        System.exit(0);







    }

}
