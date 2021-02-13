package edu.grcy.solid.dip.fixed;

public class FileRepository implements Repository {
    @Override
    public void saveTask(String task) {
        System.out.println("Save task called from FileRepository: " + task);
    }

    @Override
    public void deleteTask(String task) {
        System.out.println("Delete task called from FileRepository: " + task);
    }
}
