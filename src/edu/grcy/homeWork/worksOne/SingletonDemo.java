package edu.grcy.homeWork.worksOne;

public class SingletonDemo {
    public static void main(String[] args) {
        ServersSingleton serversSingleton= ServersSingleton.getINSTANCE();

        serversSingleton.isAddedSerwerToListServer("https:www.wp.pl");
        serversSingleton.isAddedSerwerToListServer("http");
        serversSingleton.isAddedSerwerToListServer("http:www");
        serversSingleton.isAddedSerwerToListServer("https:www.wp.pl");
        serversSingleton.isAddedSerwerToListServer("SERVER5");

        System.out.println("-----------Servers with name start with http-------------------------------");
        serversSingleton
                .getListServersStartWithLetters("http")
                .stream()
                .forEach(System.out::println);
        System.out.println("-----------Servers with name start with https-------------------------------");
        serversSingleton
                .getListServersStartWithLetters("https")
                .stream()
                .forEach(System.out::println);


        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.isAddedSerwerToListServer("https:www.wp.pl");
        singletonEnum.isAddedSerwerToListServer("http");
        singletonEnum.isAddedSerwerToListServer("http:www");
        singletonEnum.isAddedSerwerToListServer("https:www.wp.pl");
        singletonEnum.isAddedSerwerToListServer("SERVER5");
        System.out.println("-----------Enum Servers with name start with http-------------------------------");

        singletonEnum.getListServesEnum().stream()
                .filter(x -> x.startsWith("http"))
                .forEach(System.out::println);
        System.out.println("-----------Enum Servers with name start with https-------------------------------");
        singletonEnum.getListServesEnum().stream()
                .filter(x -> x.startsWith("https"))
                .forEach(System.out::println);

    }

}
