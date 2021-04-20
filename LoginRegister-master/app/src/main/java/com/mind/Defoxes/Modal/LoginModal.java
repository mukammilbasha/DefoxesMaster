package com.mind.Defoxes.Modal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginModal {
    // string variables for our name and job
    @SerializedName("name")
    @Expose
    private String Username;
    @SerializedName("email")
    @Expose
    private String password;
    @SerializedName("contact_number")
    @Expose
    private int  contact_no;
    public LoginModal(String Username, String password) {
        this.Username = Username;
        this.password = password;

    }
    public String getUserName() {
        return Username;
    }
    public void setUsername(String Username) {
        this.Username = Username;
    }
    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

}


