package edu.grcy.solid.isp.fixed;

public class LoggingDemo {
    public static void main(String[] args) {

        ReadableLogger readableLogger = new FileLogger();
        readableLogger.writeMessage("aaaaaa");
        readableLogger.writeMessage("bbbbbb");
        readableLogger.writeMessage("cccccc");
        readableLogger.writeMessage("ddddddd");

        System.out.println("Odczyt zawartosci loga");


        readableLogger.readMessage().forEach(System.out::println);

        //logger tylko
        Logger logger = new ConsolLogger();
        logger.writeMessage("xxxx");
        logger.writeMessage("ttt");
        logger.writeMessage("yyy");
        logger.writeMessage("qqq");

        /**
         * FileLogger moze byc implementacja Loggera
         */

        Logger anotherLogger = new FileLogger();
        anotherLogger.writeMessage("message");
        //jesli chcemy odczytac to robimy explicite rzutowanie
        ((ReadableLogger)anotherLogger).readMessage();
    }
}
