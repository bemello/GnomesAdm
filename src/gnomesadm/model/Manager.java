/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gnomesadm.model;

/**
 *
 * @author Bernard Mello
 */
public class Manager extends Employee {
    
    private String username;
    
    private String password;

    public Manager( String username, String password ) {
        this.username = username;
        this.password = password;
    }

    public Manager( String username, String password, String name, String email ) {
        super( name, email );
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername( String username ) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }
    
}