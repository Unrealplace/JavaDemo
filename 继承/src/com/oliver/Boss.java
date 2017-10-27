package com.oliver;

/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 上午10:13 2017/10/22
 * @Modified By:
 */
public final class Boss extends Manager {
    private double allMoney;

    public void setAllMoney(double allMoney) {
        this.allMoney = allMoney;
    }

    public double getAllMoney() {
        return allMoney;
    }


    public Boss(String name, double salary, double bounds){
        super(name,salary,bounds);
        this.allMoney = this.getSalary()+this.getBounds()+100000;
    }



}
