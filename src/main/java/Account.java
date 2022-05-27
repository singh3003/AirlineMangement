import enums.AccountStatus;

public class Account {

    String id;
    String password;
    AccountStatus accountStatus;


    public boolean resetPassword(){
        this.password = "12345";
        return true;
    }
}
