package org.LearningStuff.Seralizeable;

import java.io.Serializable;

public class Idols implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String firstname;
    private String lastname;
    private String stagename;
    private String gender;
    public Idols() {}

    public Idols(int id, String firstname, String lastname, String stagename, String gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.stagename = stagename;
        this.gender = gender;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getFirstname() {return firstname;}
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public String getLastname() {return lastname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
    public String getStagename() {return stagename;}
    public void setStagename(String stagename) {this.stagename = stagename;}
    public String getGender() {return gender;}
    public void setGender(String gender) {this.gender = gender;}
}
