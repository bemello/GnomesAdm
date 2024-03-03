/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnomesadm.test.model;

import gnomesadm.model.Employee;

/**
 *
 * @author Bernard Mello
 */
public class EmployeeTest {

    public static void main( String[] args ) {

        Employee employeeOne = new Employee( "Joe Bloggs", "jb@gmail.com" );
        Employee employeeTwo = new Employee( "Ann Banana", "ab@gmail.com" );
        Employee employeeThree = new Employee( "Tom Thumb", "tt@gmail.com" );

        Employee[] projectGroup = { employeeOne, employeeTwo, employeeThree };
        
        System.out.println( Employee.getNextEmpNum() );
        
        displayEmployeeNames( projectGroup, 2 );
    }
    
    /* This method returns the employee names which have an employee number bigger than the variable m */
    private static void displayEmployeeNames( Employee[] employees, int m ) {
        for ( Employee employee : employees ) {
            if ( employee.getEmpNum() > m ) {
                System.out.println( "Name: " + employee.getName() );
            }
        }
    }

}
