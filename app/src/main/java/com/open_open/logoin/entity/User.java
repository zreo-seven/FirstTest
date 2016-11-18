package com.open_open.logoin.entity;

/**
 * Created by ${yong} on 2016/11/17.
 */
public class User {
    private String password;
    private String mobile;
    private String verify_code;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setVerify_code(String verify_code) {
        this.verify_code = verify_code;
    }

    public String getPassword() {
        return password;
    }

    public String getMobile() {
        return mobile;
    }

    public String getVerify_code() {
        return verify_code;
    }
}
