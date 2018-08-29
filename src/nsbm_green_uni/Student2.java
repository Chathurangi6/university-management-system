/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm_green_uni;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Student2 {
    
    private int StuID;
    private String name;
    private String sex;
    private String contactNo;
    private String email;
     private String year;
    private String qualifi;
    private String institu;
    private String endyear;
    
    
    public String getEndyear(){
        return endyear;
    }
    public void setEndyear(String yr){
        endyear=yr;
    }
    
    public String getInstitu(){
        return institu;
    }
    public void setInstitu(String inst){
        institu=inst;
    }
    
    public String getQualifi(){
        return qualifi;
    }
    public void setQualifi(String qual){
        qualifi=qual;
    }
     public String getYear(){
        return year;
    }
    public void setYear(String year){
        this.year=year;
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
    
    
  /*  public void addStudent(Student2 em){
        System.out.println("Add student 1");
        con=DriverManager.getConnection(url,username,password);
        String query="INSERT INTO "
    }
    
    public void underg_tableload(JTable table,String valueToSearch){
        Connection con= MySqlConnect.ConnectDB();
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("SELECT id,name,sex,age,address,contact No,email,year,z-score,rank FROM undergraduate CONCAT ('name') LIKE ?");
            pst.setString(1, valueToSearch);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            
            Object row[];
            while(rs.next()){
                row=new Object[10];
                row[0]=rs.getInt(1);
                row[1]=rs.getString(2);
                row[2]=rs.getString(3);
                row[3]=rs.getString(4);
                row[4]=rs.getString(5);
                row[5]=rs.getString(6);
                row[6]=rs.getString(7);
                row[7]=rs.getString(8);
                row[8]=rs.getString(9);
                row[9]=rs.getString(10);
            }
        }
        catch(Exception ex){
            System.err.print(ex);
        }
    }
    
    public void postg_tableload(JTable table,String valueToSearch){
        Connection con= MySqlConnect.ConnectDB();
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("SELECT * FROM postgraduate WHERE CONCAT ('name') LIKE ?");
            pst.setString(1,"%"+ valueToSearch +"%");
            ResultSet rs=pst.executeQuery();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            
            Object row[];
            while(rs.next()){
                row=new Object[11];
                row[0]=rs.getInt(1);
                row[1]=rs.getString(2);
                row[2]=rs.getString(3);
                row[4]=rs.getInt(4);
                row[4]=rs.getString(5);
                row[5]=rs.getString(6);
                row[6]=rs.getString(7);
                row[7]=rs.getString(8);
                row[8]=rs.getString(9);
                row[9]=rs.getString(10);
                row[10]=rs.getString(11);
            }
        }
        catch(Exception ex){
            System.err.print(ex);
        }
    }
    */
    
   /* public void insertUpdateDeleteUndergraduate(char operation,Integer id,String name,String sex,Integer age,String address,String contact,
                                                 String email,String year,String zscore,Integer rank,String sub1,String sub2,String sub3,String gra1,String gra2,String gra3){
        
        
    }*/
}