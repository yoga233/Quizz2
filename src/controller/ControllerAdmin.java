package controller;

import model.ModelAdmin;
import model.ModelAkun;

import java.util.ArrayList;

public class ControllerAdmin {
    ArrayList<ModelAdmin> Admin;

    public ControllerAdmin(){
        this.Admin = new ArrayList<>();
    }
    public Boolean cekLogin(String user, String pass){
        for(ModelAdmin admin : Admin ){
            if (admin.getAdmin().equals(user) && admin.getPass().equals(pass)){
                return true;
            }
        }
        return false;
    }
}
