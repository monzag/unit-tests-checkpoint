package com.monzag.checkpoint4Test;

import java.util.ArrayList;

public class Customer {

    private String name;
    private String surname;
    private Integer birthyear;
    private String gender;
    private ArrayList<Sale> sales;

    public Customer() {

    }

    public Customer(String name, String surname, Integer birthyear, String gender){
        setName(name);
        setSurname(surname);
        setBirthyear(birthyear);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name.length() < 1) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws IllegalArgumentException {
        if (surname.length() < 1) {
            throw new IllegalArgumentException();
        }
        this.surname = surname;
    }

    public Integer getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(Integer birthyear) throws IllegalArgumentException {
        if (birthyear < 1900 || birthyear > 2017) {
            throw new IllegalArgumentException();
        }
        this.birthyear = birthyear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws IllegalArgumentException {
        if (gender != "Male" || gender != "Female") {
            throw new IllegalArgumentException();
        }
        this.gender = gender;
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
    }

    public Integer getAge() {
        return 2017 - this.birthyear;
    }

}
