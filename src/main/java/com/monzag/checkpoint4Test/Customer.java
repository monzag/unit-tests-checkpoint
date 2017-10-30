package com.monzag.checkpoint4Test;

import java.time.LocalDate;
import java.util.ArrayList;


public class Customer {

    private String name;
    private String surname;
    private Integer birthyear;
    private String gender;
    private ArrayList<Sale> sales = null;

    public Customer() {

    }

    public Customer(String name, String surname, Integer birthyear, String gender){
        setName(name);
        setSurname(surname);
        setBirthyear(birthyear);
        setGender(gender);
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
        LocalDate currentDate = LocalDate.now();
        Integer year = currentDate.getYear();

        if (birthyear < 1900 || birthyear > year) {
            throw new IllegalArgumentException();
        }
        this.birthyear = birthyear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws IllegalArgumentException {
        if (gender.equals("Male") || gender.equals("Female")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
    }

    public Integer getAge() {
        LocalDate currentDate = LocalDate.now();
        Integer year = currentDate.getYear();

        return year - this.birthyear;
    }

}
