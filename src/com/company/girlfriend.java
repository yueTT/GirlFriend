package com.company;

public class girlfriend {

    private String name;
    private int age;

    public girlfriend(String _name, int _age){
        this.name = _name;
        this.age = _age;
    }

    public void setName(String _name){
        this.name = _name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int _age){
        this.age = _age;
    }
    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("女朋友的名字：%s,女朋友的年龄：%d",getName(),getAge());
    }
}
