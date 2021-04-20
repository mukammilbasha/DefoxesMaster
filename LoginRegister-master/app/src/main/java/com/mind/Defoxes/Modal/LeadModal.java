package com.mind.Defoxes.Modal;

public class LeadModal {

    // string variables for our name and job
    private String Name;
    private String Email;
    private String Contact_number;
    private String Note;
    private String Another_note;
    public LeadModal(String Name, String Email, String contact_number, String Note,String  another_note) {
        this.Name = Name;
        this.Email = Email;
        this.Contact_number = Contact_number;
        this.Note = Note;
        this.Another_note = another_note;

    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email){this.Email = Email;}
    public String getContact_number() {
        return Contact_number;
    }
    public void setContact_number(String Contact_number) {
        this.Contact_number = Contact_number;
    }
    public String getNote() {
        return Note;
    }
    public void setNote(String Note) {
        this.Note = Note;
    }
    public String getAnother_note() {
        return Another_note;
    }
    public void setAnother_note(String Another_note) {
        this.Another_note = Another_note;
    }
}
