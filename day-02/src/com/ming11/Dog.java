package com.ming11;


public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse(){
        System.out.println("吃骨头");
    }



}
