
import com.oliver.*;

import java.lang.reflect.*;
import java.util.Scanner;


/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 下午10:15 2017/10/21
 * @Modified By:
 */
public class Main {

    public  static void  main(String[] args){

        /**
         * manager 继承自Employee
         */
        Manager Tom = new Manager("oliver",45555,999);
        Tom.setBounds(1000000);
        System.out.print("tom --->money:"+Tom.getSalary());

        System.out.print(Tom.toString());
        System.out.print(Tom.hashCode());

        Employee[] workArray = new Employee[4];
        workArray[0] = Tom;
        workArray[1] = new Employee();
        workArray[2] = new Employee("liyang",555);
        workArray[3] = new Manager("jhon",999,888);


        /**多态的用法
         * 父类的指针指向子类的对象
         */
        Employee  e = (Employee) workArray[0];//强制类型转换

        System.out.print("\nwork0--->money:\n"+e.getSalary());

        for (Employee emp:workArray) {
            System.out.print("\nname="+emp.getName()+"\n");
        }

        /**
         * 最终类，不能在往下继承了
         *
         */
        Boss boss = new Boss("boss",666,999);
        System.out.print("boss --->money:"+boss.getSalary());


        /**
         * 使用继承自抽象类的实例
         */
        Student st = new Student("oliver",1,25);

        System.out.print(st.getDescription());
        st.sleepWithWife("苍老师");


        //自动装箱
        Integer num = 5;


        Class <Manager> mClass = Manager.class;

        try {
            Constructor<Manager> constructor = mClass.getConstructor(String.class,double.class,double.class);
            Manager   json = constructor.newInstance("json",444,888);
            System.out.print(json.getSalary()+"\n");

        }catch (Exception eee){

            System.out.print(eee);
        }

        Size s = (Size) Enum.valueOf(Size.class,"SMALL");

        Size[] values = Size.values();

        System.out.print(s+"\n");

        for (int i =0;i<values.length;i++){
            System.out.print(values[i]+"\n");
        }

        Scanner in = new Scanner(System.in);
        System.out.print("enter a size");
        String  input = in.next().toUpperCase();
        Size    asize = Enum.valueOf(Size.class,input);
        System.out.print("size="+asize);




    }
}
