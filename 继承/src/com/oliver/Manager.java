package com.oliver;

/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 下午9:49 2017/10/21
 * @Modified By:
 */
public class Manager extends Employee {

    private double bounds;

    public void setBounds(double bounds) {
        this.bounds = bounds;
    }

    public double getBounds() {
        return bounds;
    }

    public Manager(String name,double salary,double bounds){
        super(name,salary);
        this.bounds = bounds;

    }

    @Override
    public double getSalary() {
        return super.getSalary()+this.bounds;
    }

}
