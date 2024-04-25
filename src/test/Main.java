package test;

public class Main {
    public static void main(String[] args) {
        User u = new User(); // object
        u.mobile ="080808"; //  public
        u.email ="ddd@ffff.com"; //protected
        u.password="123"; // default

        System.out.println(u.sayHello());

        Employee e = new Employee();
        e.email ="sss@fff.cc";
        System.out.println(e.sayHello());
    }
}
