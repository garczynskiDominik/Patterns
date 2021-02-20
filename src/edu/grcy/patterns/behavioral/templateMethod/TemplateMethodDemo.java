package edu.grcy.patterns.behavioral.templateMethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        NewsProvider first = new EmailNewsProvider("a@op.pl");
        first.setMessage("first notify");
        first.provideNews();

        NewsProvider second = new PhoneNewsProvider("+4411223344");
        second.setMessage("work in London");
        second.provideNews();
    }
}
