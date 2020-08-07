package com.myparttern.observe;

public class ConcreateObserver implements IMyObserver{


    public void update(String state) {
        System.out.println("状态变更为：" + state);
    }

}
