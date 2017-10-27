package com.oliver;

/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 下午10:03 2017/10/25
 * @Modified By:
 */
public interface Powered extends Moveable {
    /**
     * 扩展接口
     */
    //接口中不能包含实例域或静态方法，但是可以包含常量
    double SPEED_LIMIT = 95;// a public static final constant

    double milesPerGallon();

    int runFast(double speed);


}
