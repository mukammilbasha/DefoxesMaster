package com.mind.Defoxes.Modal;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContactModal {
    // string variables for our name and job
    @SerializedName("Username")
    @Expose
    private String Username;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("contact_no")
    @Expose
    private String  contact_no;
    public ContactModal(String Username, String password,String contact_no) {
        this.Username = Username;
        this.email = email;
        this.contact_no = contact_no;

    }
    public String getUserName() {
        return Username;
    }
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getemail() {
        return email;
    }
    public void setemail(String email) {
        this.email = email;
    }

    public String getcontact_no() {
        return contact_no;
    }

    public void setcontact_no(String contact_no) {
        this.contact_no = contact_no;
    }


}
