/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author bruno
 */
public class Profile {
    private String Name;
    private String password;

    public Profile(String Name, String password) {
        this.Name = Name;
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public String getPassword() {
        return password;
    }
    
}
