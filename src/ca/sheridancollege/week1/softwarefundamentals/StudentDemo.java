/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 RDHIMA TARA 
 991540855
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 ** A class to model Student Objects
 * each student has: a name (first and last name)
 * each student can: say their name (getName)

 * @author Sivagama
 */
public class StudentDemo {

    private String name;
    private int n;

    //constructor
    public StudentDemo(String givenName,int n)
    {
        name=givenName;
        int sid = n;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    String getSid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
