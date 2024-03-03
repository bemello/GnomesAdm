/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gnomesadm;

import gnomesadm.model.Company;
import gnomesadm.model.Employee;
import gnomesadm.model.Manager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Bernard Mello
 */
public class GnomesAdm {

    private static Company company;
    
    private static Manager manager;
    
    private static Scanner scanner;
    
    /*
        Implementing the Manager menu. From here, the manager 
        will be able to view, add and remove staffs.
     */
    public static void main( String[] args ) {
        scanner = new Scanner( System.in );
        company = new Company( "Mock Company" );
        manager = new Manager(
                "Gnomeo", "smurf", "Saul Goodman", "sg@gnomeo.com" );
        company.addNewStaff( manager );
  //      login();
        menu();
    }

    private static void login() {

        System.out.println( "Gnomeo Employee Administration Tool" );
        System.out.println( "-------------------------" );
        System.out.println( "Please, enter your username: " );
        String username = scanner.next();
        System.out.println( "Please, enter your password: " );
        String password = scanner.next();
        
        if ( !checkUser( username, password ) ) {
            System.out.println( "Username/Password are incorrect." );
            System.out.println( "\n\n" );    
            login();
        }
        else {
            menu();
        }
        
    }
    
    private static void menu() {
        System.out.print( "Welcome, " );
        System.out.println( manager.getUsername() );
        System.out.println( "-------------------------" );
        System.out.println( "Select an option: " );
        System.out.println("1 - View Staff");
        System.out.println("2 - Add new staff");
        System.out.println("3 - Remove staff");
        System.out.println("4 - Quit");
        
      
        switch( scanner.nextInt() ) {
            case 1: 
                listStaff();
                menu();
                break;
            case 2: 
                scanner.nextLine();
                addStaff();
                menu();
                break;
            case 3: 
                deleteStaff();
                menu();
                break;
            case 4:
                break;
            default:
                System.out.println( "Invalid option!" );
                menu();
        }
    }
    
    private static boolean checkUser( String username, String password ) {
        return username.equals( manager.getUsername() ) 
                && password.equals( manager.getPassword() );            
    }

    private static void listStaff() {
        ArrayList<Employee> staff = company.getStaff();
        Iterator<Employee> it = staff.iterator();
        
        System.out.println( "Staff:" );
        
        while( it.hasNext() ) {
            Employee employee = it.next();
            System.out.println( String.format( "Employee Number: %d", employee.getEmpNum() ) );
            System.out.println( String.format( "Employee Name: %s", employee.getName() ) );
            System.out.println( String.format( "Employee E-mail: %s", employee.getEmail() ) );
            System.out.println( String.format( "Employee Type: %s", employee.getClass().getSimpleName() ) );
            System.out.println( "-----------------------" );
        }
        System.out.println( String.format( "Number of staff: %d",company.getStaffNumber() ) );
        System.out.println( "" );
    }
    
    private static void addStaff() {
        System.out.println( "Name:" );
        String name = scanner.nextLine();
        System.out.println( "E-mail:" );
        String email = scanner.next();
        System.out.println( 
                "Please, select which type of staff you want to add:" );
        System.out.println( "1 - Manager" );
        System.out.println( "2 - Employee" );
        System.out.println( "Enter any other number to go back to the menu" );
        
        switch( scanner.nextInt() ) {
            case 1:
                System.out.println( "Username: " );
                String username = scanner.next();
                System.out.println( "Password: " );
                String password = scanner.next();
                company.addNewStaff( new Manager( username, password, name, email ) );
                break;
            case 2:
                company.addNewStaff( new Employee( name, email ) );
                break;
            default:
                menu();     
        }
    }

    private static void deleteStaff() {
        ArrayList<Employee> staff = company.getStaff();
        Iterator<Employee> it = staff.iterator();
        String message = "Employee not found";
        
        System.out.println( "Employee Number: " );
        int employeeNumber = scanner.nextInt();
        
        while ( it.hasNext() ) {
            Employee employee = it.next();
            if ( employee.getEmpNum() == employeeNumber )
            {
                it.remove();
                message = String.format( "Employee %d deleted.", employeeNumber );
                break;
            }
        }
        
        System.out.println( message );
    }
}
