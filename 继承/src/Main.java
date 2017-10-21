
import com.oliver.*;


/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 下午10:15 2017/10/21
 * @Modified By:
 */
public class Main {

    public  static void  main(String[] args){

        Manager Tom = new Manager("name",45555,999);

        Tom.setBounds(1000000);

        System.out.print("tom --->money:"+Tom.getSalary());


        Employee[] workArray = new  Employee[3];

        workArray[0] = Tom;
        workArray[1] = new Employee();
        workArray[2] = new Employee("liyang",555);





    }
}
