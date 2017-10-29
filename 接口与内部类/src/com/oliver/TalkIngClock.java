package com.oliver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 下午10:04 2017/10/28
 * @Modified By:
 */
public class TalkIngClock {
    private final int interval;
    private boolean beep;
    private double timeInt;



    public TalkIngClock(int interval, boolean beep){
        this.interval = interval;
        this.beep = beep;
    }
    public  void start(){

        ActionListener listener = new TimePrinter();

        Timer t = new Timer(interval,listener);
        t.start();

    }
    public   class TimePrinter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            Date now = new Date();
            System.out.print("at ht tone ,the time is "+now+"\n");
            /**
             * 内部类的对象持有了一个外部类的对象，所有可以访问外部类的各种数据域
             * 在内部类中访问外部类的对象用下面这种方式
             */

            if (TalkIngClock.this.interval>500)System.out.print("time big than 500");

            if (beep) Toolkit.getDefaultToolkit().beep();

        }

        private double innerTime;

        public void setInnerTime(double innerTime) {
            this.innerTime = innerTime;
            timeInt = this.innerTime;

        }

        public double getInnerTime() {
            return innerTime + TalkIngClock.this.timeInt;
        }
    }

}
