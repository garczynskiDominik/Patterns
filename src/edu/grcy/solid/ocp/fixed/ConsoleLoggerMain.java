package edu.grcy.solid.ocp.fixed;

public class ConsoleLoggerMain {
    public static void main(String[] args) throws Exception {
        MessageLogger messageLogger = new ConsolLogger();
        Logger logger = new Logger(messageLogger);


        try {
            logger.log("aaa");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------");
        MessageLogger messageLoggerForDb = new DatabaseLogger();
        Logger anotherLogger = new Logger(messageLogger);
        anotherLogger.log("bbbbbbb");
    }
}
