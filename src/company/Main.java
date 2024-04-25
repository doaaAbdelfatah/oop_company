package company;

public class Main {
    public static void main(String[] args) {
        User u = new User("dode" ,"123" ,"doaa@yahoo.com");
        u.email = "dode3us@gmail.com";
        if( u.changePassword("123" , "456")){
            System.out.println("password changed successfully");
        } else System.out.println("Invalid current password");

        User x =new User("ahmed" , "abc" , "hamada@gmail.com");
        x.changePassword("abc" , "xyz");


        Customer c = new Customer("Sara" , "123456" , "sara@gmail.com");
        c.changePassword("123456" , "xccccc");



    }
}
