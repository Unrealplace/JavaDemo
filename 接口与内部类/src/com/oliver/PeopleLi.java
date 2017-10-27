package com.oliver;

/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 下午10:05 2017/10/27
 * @Modified By:
 */
public class PeopleLi {
    
    public void executeMessage(CallBack call,String question){
        System.out.print("xiao wang wen de wenti--->"+question);
        
        for (int i=0;i<10000;i++){}
        
        call.solve("this is the answer 10000");
        
    }
}
