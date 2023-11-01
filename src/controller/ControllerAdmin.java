package controller;

import model.ModelAdmin;

public class ControllerAdmin {
    ModelAdmin admin;

    public ControllerAdmin() {
        this.admin = new ModelAdmin();
    }

    public Boolean cekLogin(String user, String pass) {
        return admin.getAdmin().equals(user) && admin.getPass().equals(pass);
    }
}
