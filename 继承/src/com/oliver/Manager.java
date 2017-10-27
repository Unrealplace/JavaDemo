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


    /**
     * 构造方法
     * @param 初始化名字
     * @param 薪水
     * @param 奖金
     */
    public Manager(String name,double salary,double bounds){
        super(name,salary);
        this.bounds = bounds;

    }

    @Override
    public double getSalary() {
        return super.getSalary()+this.bounds;
    }


    @Override
    public Employee getMySelf() {

        return this;
    }

    @Override
    public boolean equals(Object otherObject) {
        return super.equals(otherObject);
    }

    @Override
    public String toString() {
        return super.toString()
                +"[bounds="+bounds
                +"]";
    }

    @Override
    public int hashCode() {
        return super.hashCode()
                +new Double(bounds).hashCode();
    }
}
