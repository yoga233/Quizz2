package node;

public class NodeAkun{
    String Username;
    String Password;
    public NodeAkun(String username , String password){
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
