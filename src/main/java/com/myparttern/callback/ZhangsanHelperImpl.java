package com.myparttern.callback;

/**
 * 自实现回调接口（这种类可以有多个，张三、李四、王武...）
 */
public class ZhangsanHelperImpl implements HelperInterface {
    @Override
    public void execute() {
        System.out.println("This is zhangsna helper ,you can ask lisi helper");
    }
}
