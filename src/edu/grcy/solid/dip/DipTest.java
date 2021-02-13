package edu.grcy.solid.dip;

import java.util.ArrayList;
import java.util.List;

public class DipTest {
    public static void main(String[] args) {

        TaskService service = new TaskService();
        service.addTask("SampleFile.txt");
        service.removeTask("OtherFile.txt");
    }
}
