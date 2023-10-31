package controller;
import model.ModelAkun;
import java.util.ArrayList;

public class ControllerAkun {
    ArrayList<ModelAkun> lojin;

    public ControllerAkun(){
        this.lojin = new ArrayList<>();
    }
    public void Insertpassword(String usernme , String password){
        int index =lojin.size();
        this.lojin.add(new ModelAkun(usernme,password));
    }
    public Boolean cekLogin(String username , String password){
        for (ModelAkun acc : lojin ){
            if (acc.getUsername().equals(username) && acc.getPassword().equals(password)){
                return true;
            }

        }
        return false;
    }
}
