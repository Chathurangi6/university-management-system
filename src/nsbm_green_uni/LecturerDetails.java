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
public class LecturerDetails extends AbstractTableModel{
    private static final String[] column_names={"ID","Name","email","contact No","Subjects"};
    private static ArrayList <Lecturer> list;
    LecturerDetails(ArrayList<Lecturer> lecList){
        list=lecList;
    }

    @Override
    public int getRowCount() {
        return list.size();//To change body of generated methods, choose Tools | Templates.
    }
     public String getColumnName(int columnIndex){
        return column_names[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return column_names.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
           case 0:return list.get(rowIndex).getId();
           case 1:return list.get(rowIndex).getName();
           case 2:return list.get(rowIndex).getEmail();
           case 3:return list.get(rowIndex).getContact();
           case 4:return list.get(rowIndex).getSubjects();
      
           default:return "error";
        }//To change body of generated methods, choose Tools | Templates.
    }
}
