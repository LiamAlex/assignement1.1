/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author daley
 */
public class student {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String postalCode;
    private LocalDate dateOfBirth;
    private LocalDate dateEnrolled;
    private int studentNum;

    public student(String firstName, String lastName, String streetAddress, String city, String postalCode, LocalDate dateOfBirth, LocalDate dateEnrolled, int studentNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
        this.dateOfBirth = dateOfBirth;
        this.dateEnrolled = dateEnrolled;
        this.studentNum = studentNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate getDateEnrolled() {
        return dateEnrolled;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateEnrolled(LocalDate dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }
    
    public void isInGoodStanding(boolean goodStanding){
        if (goodStanding = true)
            return true;
        else 
            return false;
    }
    //this sets their current “good standing” to be false
    public void suspendStudent(boolean goodStanding){
        return goodStanding =false;
    }
    //reinstate the student’s “good standing” to be true
    public void reinstateStudent(boolean goodStanding){
        return goodStanding = true;
    }
    //returns the first name, last name and student number
    public void toString(String firstName, String lastName, int studentNum){
        return firstName, lastName, studentNum;
    }
    //returns the year a Student was born
    public void getYearBorn(LocalDate dateOfBirth){
     return dateOfBirth.getYear();
    }
    //returns the year the student enrolled at the college
    public void getEnrolled(LocalDate dateEnrolled){
     return dateEnrolled.getYear();
    }
}
