package model;

public class ModelAkun{
    String Username;
    String Password;
    public ModelAkun(String username , String password){
        this.Username = username;
        this.Password = password;
    }

    public String getPassword() {
        return Password;
    }

    public String getUsername() {
        return Username;
    }
}
