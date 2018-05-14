package com.gao.servicefeign.vo;

public class Person /*implements Serializable*/{
//    private static final long serialVersionUID = -2779141298726852757L;
    private int age;
    private String name;

    // 必须要有无参数构造方法
    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
