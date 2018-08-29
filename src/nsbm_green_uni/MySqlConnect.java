/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm_green_uni;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author anjet
 */
public class MySqlConnect {
    Connection con = null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    public static Connection ConnectDB(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
            System.out.println("Connected to the database");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    ArrayList<Student> getStudentUB(){
        try{
            ArrayList<Student> list=new ArrayList<Student>();
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "SELECT * FROM undergraduate";
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           rs = pst.executeQuery();
           
           while(rs.next()){
               Student s =new Student();
               s.setStuID(rs.getInt(1));
               s.setName(rs.getString(2));
               s.setSex(rs.getString(3));
               s.setContactNo(rs.getString(4));
               s.setEmail(rs.getString(5));
               s.setYear(rs.getString(6));
               s.setZscore(rs.getString(7));
               s.setRank(rs.getString(8));
               s.setSubj1(rs.getString(9));
               s.setSubj2(rs.getString(10));
               s.setSubj3(rs.getString(11));
               s.setGrade1(rs.getString(12));
               s.setGrade2(rs.getString(13));
               s.setGrade3(rs.getString(14));
               list.add(s);
           }
           return list;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
    
    ArrayList<Student> getStudentUC(){
        try{
            ArrayList<Student> list=new ArrayList<Student>();
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "SELECT * FROM undergraduate_computing";
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           rs = pst.executeQuery();
           
           while(rs.next()){
               Student s =new Student();
               s.setStuID(rs.getInt(1));
               s.setName(rs.getString(2));
               s.setSex(rs.getString(3));
               s.setContactNo(rs.getString(4));
               s.setEmail(rs.getString(5));               
               s.setYear(rs.getString(6));
               s.setZscore(rs.getString(7));
               s.setRank(rs.getString(8));
               s.setSubj1(rs.getString(9));
               s.setSubj2(rs.getString(10));
               s.setSubj3(rs.getString(11));
               s.setGrade1(rs.getString(12));
               s.setGrade2(rs.getString(13));
               s.setGrade3(rs.getString(14));
               list.add(s);
           }
           return list;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
    
    ArrayList<Student> getStudentUE(){
        try{
            ArrayList<Student> list=new ArrayList<Student>();
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "SELECT * FROM undergraduate_engineering";
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           rs = pst.executeQuery();
           
           while(rs.next()){
               Student s =new Student();
               s.setStuID(rs.getInt(1));
               s.setName(rs.getString(2));
               s.setSex(rs.getString(3));
               s.setContactNo(rs.getString(4));
               s.setEmail(rs.getString(5));
               s.setYear(rs.getString(6));
               s.setZscore(rs.getString(7));
               s.setRank(rs.getString(8));
               s.setSubj1(rs.getString(9));
               s.setSubj2(rs.getString(10));
               s.setSubj3(rs.getString(11));
               s.setGrade1(rs.getString(12));
               s.setGrade2(rs.getString(13));
               s.setGrade3(rs.getString(14));
               list.add(s);
           }
           return list;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
    
    ArrayList<Student2> getStudentPB(){
        try{
            ArrayList<Student2> list=new ArrayList<Student2>();
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "SELECT * FROM postgraduate";
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           rs = pst.executeQuery();
           
           while(rs.next()){
               Student2 s2 =new Student2();
               s2.setStuID(rs.getInt(1));
               s2.setName(rs.getString(2));
               s2.setSex(rs.getString(3));
               s2.setContactNo(rs.getString(4));
               s2.setEmail(rs.getString(5));
               s2.setYear(rs.getString(6));
               s2.setQualifi(rs.getString(7));
               s2.setInstitu(rs.getString(8));
               s2.setEndyear(rs.getString(9));
               list.add(s2);
           }
           return list;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
    ArrayList<Student2> getStudentPC(){
        try{
            ArrayList<Student2> list=new ArrayList<Student2>();
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "SELECT * FROM postgraduate_computing";
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           rs = pst.executeQuery();
           
           while(rs.next()){
               Student2 s2 =new Student2();
               s2.setStuID(rs.getInt(1));
               s2.setName(rs.getString(2));
               s2.setSex(rs.getString(3));
               s2.setContactNo(rs.getString(4));
               s2.setEmail(rs.getString(5));
               s2.setYear(rs.getString(6));
               s2.setQualifi(rs.getString(7));
               s2.setInstitu(rs.getString(8));
               s2.setEndyear(rs.getString(9));
               list.add(s2);
           }
           return list;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
    ArrayList<Student2> getStudentPE(){
        try{
            ArrayList<Student2> list=new ArrayList<Student2>();
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "SELECT * FROM postgraduate_engineering";
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           rs = pst.executeQuery();
           
           while(rs.next()){
               Student2 s2 =new Student2();
               s2.setStuID(rs.getInt(1));
               s2.setName(rs.getString(2));
               s2.setSex(rs.getString(3));
               s2.setContactNo(rs.getString(4));
               s2.setEmail(rs.getString(5));
               s2.setYear(rs.getString(6));
               s2.setQualifi(rs.getString(7));
               s2.setInstitu(rs.getString(8));
               s2.setEndyear(rs.getString(9));
               list.add(s2);
           }
           return list;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
    public boolean updateUB(Student em){
        try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "UPDATE undergraduate SET name='"+em.getName()+"',sex='"+em.getSex()+"',contactNo='"+em.getContactNo()+"',email='"+em.getEmail()+"',year='"+em.getYear()+"',zscore='"+em.getZscore()+"',rank='"+em.getRank()+"',subject1='"+em.getSubj1()+"',subject2='"+em.getSubj2()+"',subject3='"+em.getSubj3()+"',grade1='"+em.getGrade1()+"',grade2='"+em.getGrade2()+"',grade3='"+em.getGrade3()+"' WHERE id="+em.getStuID();
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           pst.executeUpdate(); 
           return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    public boolean updatePB(Student2 em){
        try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "UPDATE postgraduate SET name='"+em.getName()+"',sex='"+em.getSex()+"',contactNo='"+em.getContactNo()+"',email='"+em.getEmail()+"',Year='"+em.getYear()+"',qualificationType='"+em.getQualifi()+"',institute='"+em.getInstitu()+"',endYear='"+em.getEndyear()+"' WHERE id="+em.getStuID();
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           pst.executeUpdate(); 
           return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public boolean deleteUB(Student em){
        try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "DELETE FROM undergraduate WHERE id="+em.getStuID();
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           pst.executeUpdate(); 
           return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public boolean deleteUC(Student em){
        try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "DELETE FROM undergraduate_computing WHERE id="+em.getStuID();
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           pst.executeUpdate(); 
           return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public boolean deleteUE(Student em){
        try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "DELETE FROM undergraduate_engineering WHERE id="+em.getStuID();
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           pst.executeUpdate(); 
           return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    public boolean deletePB(Student2 em){
        try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "DELETE FROM postgraduate WHERE id="+em.getStuID();
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           pst.executeUpdate(); 
           return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public boolean deletePC(Student2 em){
        try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "DELETE FROM postgraduate_computing WHERE id="+em.getStuID();
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           pst.executeUpdate(); 
           return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public boolean deletePE(Student2 em){
        try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "DELETE FROM postgraduate_engineering WHERE id="+em.getStuID();
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           pst.executeUpdate(); 
           return true;
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    ArrayList<Lecturer> getLecturerB(){
        try{
            ArrayList<Lecturer> list=new ArrayList<Lecturer>();
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "SELECT * FROM lecturer";
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           rs = pst.executeQuery();
           while(rs.next()){
               Lecturer l =new Lecturer();
               l.setId(rs.getInt(1));
               l.setName(rs.getString(2));
               l.setEmail(rs.getString(3));
               l.setContact(rs.getString(4));
               l.setSubjects(rs.getString(5));
               list.add(l);
           }
           return list;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    ArrayList<Instructor> getInstructorB(){
        try{
            ArrayList<Instructor> list=new ArrayList<Instructor>();
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nsbm", "root", "");
           String sql = "SELECT * FROM instructor";
           pst=(com.mysql.jdbc.PreparedStatement) con.prepareStatement(sql);
           rs = pst.executeQuery();
           while(rs.next()){
               Instructor i =new Instructor();
               i.setId(rs.getInt(1));
               i.setName(rs.getString(2));
               i.setEmail(rs.getString(3));
               i.setContact(rs.getString(4));
               i.setSubjects(rs.getString(5));
               list.add(i);
           }
           return list;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        finally{
            try{
                if(pst!=null){
                    pst.close();
                }
                if(con!=null){
                    con.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
}
