/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primefaces;

/**
 *
 * @author radziu
 */
public class Student {
    private String firstName;
    private String surname;
    private Double avg;
    
    public Student(String firstName,String surname,Double avg){
        this.firstName = firstName;
        this.surname = surname;
        this.avg = avg;
    }
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the avg
     */
    public Double getAvg() {
        return avg;
    }

    /**
     * @param avg the avg to set
     */
    public void setAvg(Double avg) {
        this.avg = avg;
    }
}
