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
    public boolean equals(Object otherObject){
        if (this == otherObject)return true;
        if (otherObject == null)return false;
        if (this.getClass() != otherObject.getClass())return false;

        Employee  other = (Employee)otherObject;
        return name.equals(other.name) && salary==other.salary;

    }

    @Override
    public String toString() {
        return getClass().getName()
                +"[name="+name
                +",salary="+salary
                +"]";
    }

    @Override
    public int hashCode() {
        return 7*name.hashCode()
                +11*new Double(salary).hashCode();
    }

    public Employee getMySelf(){
        return this;
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
