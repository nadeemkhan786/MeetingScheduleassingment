package meetingschedulingsystem;

import java.io.Serializable;


public class Person implements Serializable {
    
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * Get the value of firstName
     *
     * @return the value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    
     /**
     * Get the value of lastName
     *
     * @return the value of lastName
     */
    public String getLastName() {
        return lastName;
    }
    
    private String phoneNumber;

    /**
     * Get the value of phoneNumber
     *
     * @return the value of phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Set the value of phoneNumber
     *
     * @param phoneNumber new value of phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    /**
     * This will be for the lists, as the list uses toString to display an Object
     * @return Name format of Person
     */
    @Override
    public String toString() {
        return String.format("%s %s", this.firstName, this.lastName); //To change body of generated methods, choose Tools | Templates.
    }
}
