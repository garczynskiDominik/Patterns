package edu.grcy.solid.ocp.fixed;

public class ConsolLogger implements MessageLogger{
    @Override
    public void log(String message) throws Exception {
        System.out.println("Logging to console: "  + message);

    }
}
