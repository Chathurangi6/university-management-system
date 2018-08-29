/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm_green_uni;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HP
 */
public class StudentDetails2 extends AbstractTableModel{
    
    private static final String[] column_names={"Stu_ID","Name","Sex","contact No","Email","Year","Qualification","Institute"};
    private static ArrayList <Student2> list;
    StudentDetails2(ArrayList<Student2> stdList){
        list=stdList;
    }
    

    @Override
    public int getRowCount() {
       return list.size();
    }
    
     public String getColumnName(int columnIndex){
        return column_names[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return column_names.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0:return list.get(rowIndex).getStuID();
           case 1:return list.get(rowIndex).getName();
           case 2:return list.get(rowIndex).getSex();
           case 3:return list.get(rowIndex).getContactNo();
           case 4:return list.get(rowIndex).getEmail();
           case 5:return list.get(rowIndex).getYear();
           case 6:return list.get(rowIndex).getQualifi();
           case 7:return list.get(rowIndex).getInstitu();
           default:return "error";
           
       }
    }
    
}
