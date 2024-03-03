/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnomesadm.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Bernard Mello
 */
public class Company {

    private String companyName;

    private ArrayList<Employee> staff;

    public Company() {
        this.companyName = "";
        this.staff = new ArrayList<>();
    }

    public Company( String companyName ) {
        this.companyName = companyName;
        this.staff = new ArrayList<>();
    }

    public void addNewStaff( Employee employee ) {
        this.staff.add( employee );
    }

    public int getStaffNumber() {
        int total = 0;
        if ( this.staff != null ) {
            total = this.staff.size();
        }
        return total;
    }

    /* 
        Method to list the staff using the employee number as a parameter. 
        The iterator goes through the ArrayList and an if is used to find 
        the employees with a bigger empNum than the parameter being used
    */
    public void listEmployees( int employeeNumber ) {
        Iterator<Employee> it = this.staff.iterator();
        
        while( it.hasNext() ) {
           Employee employee = it.next();
           if ( employee.getEmpNum() > employeeNumber )
           {
               System.out.println( employee.getName() );
           }
        }
    }
    
    /* 
        Method to remove staff using the employee number as a parameter. 
        Implemented an iterator to go through the ArrayList 
        and remove the Employee that has that Employee Number 
    */
    public void removeStaff( int employeeNumber ) {
        Iterator<Employee> it = this.staff.iterator();
        
        while( it.hasNext() ) {
           Employee employee = it.next();
           if ( employee.getEmpNum() == employeeNumber )
           {
               it.remove();
               break;
           }
        }
    }

    public ArrayList<Employee> getStaff() {
        return staff;
    }
    
}
