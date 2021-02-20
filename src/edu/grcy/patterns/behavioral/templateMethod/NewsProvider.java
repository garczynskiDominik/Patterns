package edu.grcy.patterns.behavioral.templateMethod;

public abstract class NewsProvider {
    private int id;
    private String message;

    //musimy zaimplementowac
    public abstract boolean authorize();

    //stala metoda, nie mozna zmieniac
    public final boolean sendMessage() {
        System.out.println("Message sent:" + message);
        return true;
    }

    //musimy zaimplementowac
    public boolean endConnection() {
        System.out.println("generic end conection");
        return true;
    }

    //finalna metoda, definiuje algorytm czy sciezke wykonania
    //kolejnosci nie zmieniamy
    //
    public final void provideNews() {
        authorize();
        sendMessage();
        endConnection();
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
