package com.mind.Defoxes.Modal;

public class ProfileModal {

    // string variables for our name and job
    private String BusinessName;
    private String RegisterName;
    private String DisplayName;
    private String Addrress;
    private String Locality;
    private String District;
    private String City;
    private String State;
    private String Country;
    private String Postal_code;

    //    private int  contact_no;
    public ProfileModal(String BusinessName, String RegisterName, String DisplayName, String Addrress, String Locality,String District, String City, String State, String Country, String Postal_code) {
        this.BusinessName = BusinessName;
        this.RegisterName = RegisterName;
        this.DisplayName = DisplayName;
        this.Addrress = Addrress;
        this.Locality = Locality;
        this.District = District;
        this.City = City;
        this.State = State;
        this.Country = Country;
        this.Postal_code = Postal_code;



//        this.checkbox2Pro = Chk2;

    }
    public String getBusinessName() {
        return BusinessName;
    }
    public void getBusinessName(String UserPro) {
        this.BusinessName = BusinessName;
    }

    public String getRegisterName() {
        return RegisterName;
    }
    public void setRegisterName(String Username) {
        this.RegisterName = RegisterName;
    }

    public String getDisplayName() {
        return DisplayName;
    }
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    public String getAddrress() {
        return Addrress;
    }
    public void setAddrress(String Addrress) {
        this.Addrress = Addrress;
    }

    public String getLocality() {
        return Locality;
    }
    public void setLocality(String Locality) {
        this.Locality = Locality;
    }

    public String getDistrict() {
        return District;
    }
    public void setDistrict(String District) {
        this.District = District;
    }

    public String getCity() {
        return City;
    }
    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }
    public void setState(String State) {
        this.State = State;
    }

    public String getCountry() {
        return Country;
    }
    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getPostal_code() {
        return Postal_code;
    }
    public void setPostal_code(String Postal_code) {
        this.Postal_code = Postal_code;
    }





}
