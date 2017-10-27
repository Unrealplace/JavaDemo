package com.oliver;

/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 下午10:04 2017/10/27
 * @Modified By:
 */
public class PeopleWang implements CallBack {
    private  PeopleLi li;

    public PeopleWang(PeopleLi li){
        this.li = li;
    }
    public void askQuestion(final  String question){
        new Thread(new Runnable() {
            @Override
            public void run() {
             li.executeMessage(PeopleWang.this,question);
            }
        }).start();

        this.play();
    }
    public void play(){
        System.out.print("i am playing...");
    }
    @Override
    public void solve(String result) {

        System.out.print("xiao li say answer is :"+result);

    }
}
