package company;

public class User {
    private String userName;
    private String password;
    public String email;

    public User(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public boolean changePassword(String currentPw , String newPw){
        if (this.password.equals(currentPw)){
            this.password = newPw;
            return  true;
        }else{
            return  false;
        }
    }

}
