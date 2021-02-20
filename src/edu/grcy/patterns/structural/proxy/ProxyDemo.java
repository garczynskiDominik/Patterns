package edu.grcy.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProxyDemo {
    public static void main(String[] args) {
        CompanyEmployees companyEmployees = new CompanyEmployees();
        List<String> employess = Arrays.asList("Jan Kowalski", "Maria Nowak", "Zofia Palac", "Robert Gorniak");
        companyEmployees.setUsers(employess);



        CompanyInternetNetwork internetNetwork = new ProxyCompanyInternetAccess();
        internetNetwork.getAccess("Jan Kowalski");
        internetNetwork.getAccess("Jan Nowak");
        internetNetwork.getAccess("Zofia Palac");
        internetNetwork.getAccess("Mariusz Kalamaga");


    }
}
