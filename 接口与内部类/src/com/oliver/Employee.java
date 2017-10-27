package com.oliver;

/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 下午10:01 2017/10/24
 * @Modified By:
 */
public class Employee implements Comparable,Cloneable{

    private double salary;
    private String  name;

    public Comparable com;


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Employee(String name, double salary){
        this.name = name;
        this.salary =salary;
    }

    public Employee clone()throws  CloneNotSupportedException{

        return new Employee(this.name,this.salary);
    }


    @Override
    public int compareTo(Object other) {
        Employee ot = (Employee)other;
        if (salary<ot.salary)return -1;
        if (salary>ot.salary)return 1;
        return 0;
    }
}
