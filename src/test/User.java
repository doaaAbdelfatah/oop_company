package test;

public class User {
    private  String name;
    String password; // package only

    protected  String email ;

    public String mobile;

    public User(){

    }

    protected String sayHello(){
        return "Hello from User";
    }
}
