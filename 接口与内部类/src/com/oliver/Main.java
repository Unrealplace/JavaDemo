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

        //回调
//        ActionListener listener = (ActionListener) new TimePrinter();

        try {
//            Timer  t = new Timer(10000,listener);
//            t.start();
//            JOptionPane.showMessageDialog(null,"qiut program");

        }catch (Exception e){
            System.out.print(e);

        }

        PeopleLi li = new PeopleLi();

        PeopleWang wang = new PeopleWang(li);

        wang.askQuestion("1+1=?");





    }

}
