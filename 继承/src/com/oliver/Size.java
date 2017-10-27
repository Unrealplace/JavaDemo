package com.oliver;

/**
 * @Author: Oliver Lee
 * @Description:
 * @Date: Created in 下午9:28 2017/10/24
 * @Modified By:
 */
public enum Size {
    SMALL("S"), MEDIUM("M"),LARGE("L"),EXTER_LARGE("XL");

    private Size(String str){

        this.addreviation = str;
    }

    public String getAddreviation() {
        return addreviation;
    }

    private String addreviation;
}
