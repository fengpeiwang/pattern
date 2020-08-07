package com.myparttern.observe;

public class ObserverApp {

    public static void main(String[] args) {
        //创建一个主题
        ConcreateSubject iMySubject = new ConcreateSubject();

        //创建一个观察者
        IMyObserver observer = new ConcreateObserver();
        iMySubject.register(observer);
        iMySubject.changeState("10");

    }
}
