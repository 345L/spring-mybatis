package com.example.demo.entity;

/**
 * 用户信息Entity
 * 构造快捷键 ALT+INSERT
 * @author wanghao
 * @date 2019-06-03
 */
public class User {
    private String id; // 主键
    private String name; // 用户名称
    private String password; // 密码
    private String account; // 账号

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    // 有参构造1
    public User(String id,String name, String password, String account){
        System.out.println("有参构造。");
        // 给对象赋值
        this.id = id;
        this.name = name;
        this.password = password;
        this.account = account;
    }
}
