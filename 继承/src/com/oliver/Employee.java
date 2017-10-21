package com.oliver;

import java.util.Date;

/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 下午9:47 2017/10/21
 * @Modified By:
 */
public class Employee {

    private String name;
    private double salary;
    private String birthDay;

    public Employee(){

    }
    public Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
        Date   brith = new Date();
        String theBir = new String(brith+"0000");
        this.birthDay = theBir;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }
}
