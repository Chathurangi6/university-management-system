/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm_green_uni;

/**
 *
 * @author HP
 */
public class Instructor {
    private int id;
    private String name;
    private String email;
    private String contactNo;
    private String subjects;
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String em){
        email=em;
    }
    public String getContact(){
        return contactNo;
    }
    public void setContact(String no){
        contactNo=no;
    }
    public String getSubjects(){
        return subjects;
    }
    public void setSubjects(String sub){
        subjects=sub;
    }
}
    