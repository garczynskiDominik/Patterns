package edu.grcy.solid.isp.fixed;

public class ConsolLogger implements Logger {
    @Override
    public void writeMessage(String message) {
        System.out.println("Write only for Console logger L: " + message);
    }
}
