package com.myparttern.callback;

public class HelpApp {

    public static void main(String[] args) {
        Ask ask = new Ask();
        ask.setAsk(new ZhangsanHelperImpl());
        ask.ask();
    }
}
