/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User_UI;

/**
 *
 * @author NEK PC
 */
public class StudentListTable {
    
    public String student_fname;
    public String student_lname;
    public String name;
    public String status;
    
    
    
    //Constructor
    public StudentListTable(String fname, String lname, String status){
        this.student_fname = fname;
        this.student_lname = lname;
        this.status = status;

    }
    
    public String getName(){
        name = student_fname +" "+student_lname;
        return name;
    }

    public String getStatus(){
        return this.status;
    }

    

}

