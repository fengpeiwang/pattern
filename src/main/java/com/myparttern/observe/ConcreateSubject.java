package com.myparttern.observe;

import java.util.ArrayList;
import java.util.List;

public class ConcreateSubject implements IMySubject {
    public List<IMyObserver> observerList = new ArrayList<IMyObserver>();
    String state = "new state!!!";


    @Override
    public void register(IMyObserver observer) {
        System.out.println("add a new observer!");
        observerList.add(observer);
    }

    @Override
    public void delete(IMyObserver observer) {
        System.out.println("remove a new observer!");
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        observerList.forEach(o-> o.update(state));
    }

    /**
     * 更新state的状态
     * @param state
     */
    public void changeState(String state){
        this.state = state;
        this.notifyAllObserver();
    }


}
