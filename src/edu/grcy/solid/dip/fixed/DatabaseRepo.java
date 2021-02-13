package edu.grcy.solid.dip.fixed;

public class DatabaseRepo implements Repository {
    @Override
    public void saveTask(String task) {
        System.out.println("Save to database: " + task);
    }

    @Override
    public void deleteTask(String task) {
        System.out.println("Delete from Database: " + task);

    }
}
