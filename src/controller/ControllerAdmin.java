package controller;

import model.ModelAdmin;

import java.util.ArrayList;

public class ControllerAdmin {
    ArrayList<ModelAdmin> Admin;

    public ControllerAdmin(){
        this.Admin = new ArrayList<>();
        ModelAdmin admin = new ModelAdmin();
        Admin.add(admin);
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
