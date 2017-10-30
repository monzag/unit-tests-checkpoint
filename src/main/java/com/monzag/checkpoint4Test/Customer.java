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
        this.name = name;
        this.surname = surname;
        this.birthyear = birthyear;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(Integer birthyear) {
        this.birthyear = birthyear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
    }

}
