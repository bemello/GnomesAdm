/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnomesadm.model;

/**
 *
 * @author Bernard Mello
 */
public class Employee {

    private String name;

    private String email;

    private int empNum;

    private static int nextEmpNum = 1;

    public Employee() {
        this.name = "";
        this.email = "";
        this.empNum = nextEmpNum;
        nextEmpNum++;
    }

    public Employee( String name, String email ) {
        this.name = name;
        setEmail( email );
        this.empNum = nextEmpNum;
        nextEmpNum++;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum( int empNum ) {
        this.empNum = empNum;
    }

    public static int getNextEmpNum() {
        return nextEmpNum;
    }

    public static void setNextEmpNum( int nextEmpNum ) {
        Employee.nextEmpNum = nextEmpNum;
    }

}
