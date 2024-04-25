package main;

import test.User;

public class Employee extends User {
    public Employee(){
        this.mobile ="444848"; // public
        this.email ="ddd@ddd.cc" ; // protected
    }

    protected String sayHello(){
        return "Hello from Employee outside package";
    }
}
