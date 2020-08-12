package com.myparttern.callback;

/**
 * 寻求帮助的类
 */
public class Ask {

    HelperInterface helperInterface ;

    public void setAsk(HelperInterface helperInterface) {
        this.helperInterface = helperInterface;
    }

    public void ask() {
        System.out.println("寻求帮助");
        helperInterface.execute();
    }

}
