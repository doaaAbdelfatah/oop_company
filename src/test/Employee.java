package test;

public class Employee extends User {
    public Employee(){
        this.mobile = "1111";
        this.email ="ddd@cfff.cc";
        this.password ="434";
    }

    protected String sayHello(){
        return "Hello from Employee";
    }
}
