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
public class Student {
    
    private int StuID;
    private String name;
    private String sex;
    private String contactNo;
    private String email;
    private String zscore;
    private String rank;
    private String year;
    private String sub1;
    private String sub2;
    private String sub3;
    private String grade1;
    private String grade2;
    private String grade3;
    
    
    public String getGrade3(){
        return grade3;
    }
    public void setGrade3(String gr){
        grade3=gr;
    }
    
    public String getGrade2(){
        return grade2;
    }
    public void setGrade2(String gr){
        grade2=gr;
    }
    
    public String getGrade1(){
        return grade1;
    }
    public void setGrade1(String gr){
        grade1=gr;
    }
    
    public String getSubj1(){
        return sub1;
    }
    public void setSubj1(String sub){
        sub1=sub;
    }
    
     public String getSubj2(){
        return sub2;
    }
    public void setSubj2(String sub){
        sub2=sub;
    }
    
     public String getSubj3(){
        return sub3;
    }
    public void setSubj3(String sub){
        sub3=sub;
    }
    public String getYear(){
        return year;
    }
    public void setYear(String year){
        this.year=year;
    }
    public String getRank(){
        return rank;
    }
    public void setRank(String rank){
        this.rank=rank;
    }
    
    public String getZscore(){
        return zscore;
    }
    public void setZscore(String z){
        zscore=z;
    }
    
       
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    
    public String getContactNo(){
        return contactNo;
    }
    public void setContactNo(String cNo){
        contactNo=cNo;
       
    }
    
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public int getStuID(){
        return StuID;
    }
    public void setStuID(int id){
        StuID=id;
    }
    
    
}