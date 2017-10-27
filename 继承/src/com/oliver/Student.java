package com.oliver;

//import com.oliver.Sex;

/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 上午10:46 2017/10/22
 * @Modified By:
 */
public class Student extends Person {


    public Student(String name,int sex,int age){
        super(name,sex,age);

    }

    /**
     * 实现抽象类的方法
     * @return
     */
    @Override
    public String getDescription() {
        return this.getName()+this.getAge();
    }

    public void sleepWithWife(String name){

        System.out.print("\n i am sleeping with "+name);
    }
}
