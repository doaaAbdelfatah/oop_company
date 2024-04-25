package main;


import test.User;

public class Main {

    public static void main(String[] args) {
        User u = new User(); // object
        u.mobile = "012557385144"; // public only outside the package from the object

        Employee e = new Employee();
        e.mobile="44444";
        System.out.println(e.sayHello());
    }
}
