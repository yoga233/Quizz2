package model;
import node.NodeAkun;
import java.util.ArrayList;

public class ModelAkun {
    ArrayList<NodeAkun> lojin;

    public ModelAkun(){
        this.lojin = new ArrayList<>();
    }
    public void Insertpassword(String usernme , String password){
        int index =lojin.size();
        this.lojin.add(new NodeAkun(usernme,password));
    }
    public Boolean cekLogin(String username , String password){
        for (NodeAkun acc : lojin ){
            if (acc.getUsername().equals(username) && acc.getPassword().equals(password)){
                return true;
            }

        }
        return false;
    }
}
