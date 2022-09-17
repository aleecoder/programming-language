package com.msb.tcp;

import java.io.Serializable;

/**
 * 将用户信息封装成对象在网络上传输
 * @author HuanyuLee
 * @date 2022/3/14
 */
public class User implements Serializable {
    private static final long serialVersionUID = -3256132758383548905L;
    public String username;
    public String password;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
