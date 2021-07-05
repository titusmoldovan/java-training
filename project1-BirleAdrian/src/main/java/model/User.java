package model;

import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int iduser;
    private String username;
    private String password;
    private String type;

    public User(int iduser, String username , String type){
        this.iduser = iduser;
        this.username = username;
        this.type = type;
    }

    public String getUsername() {
        return username;
    }
    public int getIduser() {
        return iduser;
    }
    public String getType() {
        return type;
    }
}
