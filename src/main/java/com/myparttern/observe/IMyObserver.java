package com.myparttern.observe;

/**
 * 观察者，关注被观察者的状态，如果被观察者的状态发生变化，改变自身状态
 */
public interface IMyObserver {

    void update(String state);

}
