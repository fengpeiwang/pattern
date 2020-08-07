package com.myparttern.observe;

/**
 * 被观察者（主题）
 */
public interface IMySubject {

    //1. 注册观察者
    void register(IMyObserver observer);

    //2. 移除观察者
    void delete(IMyObserver observer);

    //3. 通知观察者
    void notifyAllObserver();
}
