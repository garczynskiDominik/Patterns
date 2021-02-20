package edu.grcy.patterns.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Observer observer1 = new MyTopicSubscriber("Janek");
        Observer observer2 = new MyTopicSubscriber("Marek");
        Observer observer3 = new MyTopicSubscriber("Tomek");

        Subject topic = new MyTopic();
        observer1.setSubject(topic);
        observer3.setSubject(topic);

        topic.register(observer1);
        topic.register(observer3);

        ((MyTopic) topic).postMessage("wiadomosc 1");
        System.out.println("-------------------");
        observer2.setSubject(topic);
        topic.register(observer2);
        ((MyTopic) topic).postMessage("wiadomosc 2");
        System.out.println("-------------------------");
        topic.unregister(observer1);
        topic.unregister(observer2);
        ((MyTopic) topic).postMessage(" wiadomosc 3");

    }
}
