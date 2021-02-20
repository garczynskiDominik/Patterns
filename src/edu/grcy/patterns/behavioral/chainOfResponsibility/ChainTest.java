package edu.grcy.patterns.behavioral.chainOfResponsibility;

public class ChainTest {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.addEmployee("Jan Kowalski", 8);
        employees.addEmployee("Maria Zdun", 12);
        employees.addEmployee("Michal Panek", 6);

        //1. Sprawdzenie w lancuchu
        AccessCheck accessCheck =new CompanyInsiderCheck();
        //kolejne sprawdzenie w lancuchu
        accessCheck.addChainElement(new EmployeeSeniorityCheck());
        //do dorobienia sprawdzenie wlasciwego działu departmentcheck

        XCompany myCompany = new XCompany();
        myCompany.setCheck(accessCheck);
        System.out.println("============================");
        myCompany.enterRoom("Jan Kowalski");

        System.out.println("============================");
        myCompany.enterRoom("Maria Zdun");
        System.out.println("============================");
        myCompany.enterRoom("Grzegorz Dec");
    }
}
