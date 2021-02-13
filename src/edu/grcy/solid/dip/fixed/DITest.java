package edu.grcy.solid.dip.fixed;

public class DITest {
    public static void main(String[] args) {
        Repository repository = new FileRepository();
        TaskServices taskServices = new TaskServices(repository);


        taskServices.addTask("aaa.txt");
        taskServices.removeTask("bbb.txt");
        //------------------------------------

        System.out.println("Klienta zmienia decyzje, chce korzystac z basy danych");
repository = new DatabaseRepo();
taskServices.setRepository(repository);

taskServices.addTask("Check DB connection");



    }
}
