package com.archegos;

public class Hello {
    private String name;

    public Hello(){
        System.out.println("无参创建");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "hello{" +
                "name='" + name + '\'' +
                '}';
    }

    public void show(){
        System.out.println("name"+name);
    }
}
