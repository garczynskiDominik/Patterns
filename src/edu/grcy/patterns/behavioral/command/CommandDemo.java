package edu.grcy.patterns.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        MyFile myFile = new MyFile("sampleFile.txt");
        FileOperationPerformer performer = new FileOperationPerformer();
        performer.executeOperation(new CreateFileOperation(myFile), "Poczatkowa");

        System.out.println(myFile.getContent());

        performer.executeOperation(new UpdateFileOperation(myFile), "\n Dodatkowa zawartosc");
        System.out.println(myFile.getContent());

        System.out.println("---------------------");
        performer.executeOperation(new UpdateFileOperation(myFile), "\n\nJeszcze kolejna");
        System.out.println(myFile.getContent());
        System.out.println("------------------------");
        performer.executeOperation(new CreateFileOperation(myFile), "Piszemy do pliku od nowa");
        System.out.println(myFile.getContent());
        System.out.println("-----------------");
        performer.getFileOperationsHistory().forEach(System.out::println);
    }
}
