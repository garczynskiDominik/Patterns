package edu.grcy.solid.dip.fixed;

public class TaskServices {
    Repository repository;

    public TaskServices(Repository repository) {
        this.repository = repository;
        /**
         * Dependency Injection polega na wstrzyknieciu zaleznosci
         * inaczej pól i klasu, np. [rzez konstruktor ale nie tylko
         *
         *
         * przy DI nie uzywamy w klasie "new" do inicjowania obiektow
         * skladowych, tylko chcemy je w jakis sposob dostac z zewnatrz.
         */
    }

    public void addTask(String task) {
        repository.saveTask(task);
    }

    public void removeTask(String task) {
        repository.deleteTask(task);
    }

    /**
     * Setter to tez jest spoosb na Dependency Injection
     */


    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
