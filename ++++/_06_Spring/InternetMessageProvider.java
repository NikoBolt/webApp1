package com.NikoBolt;

public class InternetMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Message recieved from the internet";
    }

}
