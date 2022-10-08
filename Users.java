/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

/**
 *
 * @author rheayadav
 */
public class Users {
    private static String name;
    private static String username;

    

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Users.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
