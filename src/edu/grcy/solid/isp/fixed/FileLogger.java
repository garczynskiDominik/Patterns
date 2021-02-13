package edu.grcy.solid.isp.fixed;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FileLogger implements ReadableLogger{
    private Collection<String> messages = new ArrayList<>();

    @Override
    public void writeMessage(String message) {
        messages.add(message);
        System.out.println("Writting new message to file");
    }

    @Override
    public Collection<String> readMessage() {
        if (messages.isEmpty()){
            return Collections.EMPTY_LIST;
        }
        return messages;
    }
}
