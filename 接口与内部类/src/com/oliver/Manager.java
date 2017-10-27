package com.oliver;

/**
 * @Author: Oliver Lee
 * @Description:  一个类只能继承一个 基类，但是可以实现多个接口，从而实现多继承。
 * @Date: Created in 下午10:21 2017/10/24
 * @Modified By:
 */
public  class Manager extends Employee implements Moveable,Powered{




    public Manager(String name, double money){
        super(name,money);
    }

    @Override
    public int compareTo(Object other) {
        return super.compareTo(other);
    }


    @Override
    public void move(double x, double y) {

    }

    @Override
    public int runFast(double speed) {
        return 0;
    }

    @Override
    public double milesPerGallon() {
        return 0;
    }
}
