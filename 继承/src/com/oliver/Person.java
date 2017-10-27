package com.oliver;

//import com.oliver.Sex;

/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 上午10:31 2017/10/22
 * @Modified By:
 */
public abstract class Person {

    /**
     * 抽象类中可以包含抽象方法和 具体方法和具体属性
     * @return 描述字符串
     */

    private String name;
    private int  age;
    private int  sex;

    public Person(String name,int sex,int age){
        this.name = name;
        this.sex  = sex;
        this.age  = age;
    }

    public abstract String getDescription();

    public abstract void sleepWithWife(String name);


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSex() {
        return sex;
    }


}
