package com.oliver;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 下午9:31 2017/10/27
 * @Modified By:
 */
public class TimePrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.print("at the tone,the time is "+now);
        Toolkit.getDefaultToolkit().beep();
    }
}
