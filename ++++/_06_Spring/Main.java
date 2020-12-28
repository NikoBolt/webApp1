package com.NikoBolt;

public class Main {
    public static void main(String[] args) {
//        MessageProvider provider = new SimpleMessageProvider();
//        MessageRenderer renderer = new SimpleMessageRenderer(provider);
        MessageProvider provider = MessageFactory.getProvider();
        MessageRenderer renderer = MessageFactory.getRenderer();
        renderer.render();
    }
}
