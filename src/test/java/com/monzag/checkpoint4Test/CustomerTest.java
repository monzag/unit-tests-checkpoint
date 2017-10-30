package com.monzag.checkpoint4Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;

    @BeforeEach
    public void setUp() {
        this.customer = new Customer("Anna", "Nowak", 1990, "Female");
    }
    @Test
    public void testEmptyConstructor() {
        assertNotNull(new Customer());
    }

    @Test
    public void testGetName() {
        String expected = "Anna";
        String actual = customer.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetSurname() {
        String expected = "Nowak";
        String actual = customer.getSurname();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetBirthyear() {
        Integer expected = 1990;
        Integer actual = customer.getBirthyear();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetGender() {
        String expected = "Female";
        String actual = customer.getGender();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetAge() {
        Integer expected = 27;
        Integer actual = customer.getAge();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetSales() {
        ArrayList<Sale> actual = customer.getSales();
        assertNull(actual);
    }

    @Test
    public void testSetEmptyName() {
        String actual = "";
        assertThrows(IllegalArgumentException.class, () -> customer.setName(actual));
    }

    @Test
    public void testSetEmptySurname() {
        String actual = "";
        assertThrows(IllegalArgumentException.class, () -> customer.setSurname(actual));
    }

    @Test
    public void testSetBirthDateLowerThan() {
        Integer actual = 1899;
        assertThrows(IllegalArgumentException.class, () -> customer.setBirthyear(actual));
    }

    @Test
    public void testSetIncorrectGender() {
        String actual = "femal";
        assertThrows(IllegalArgumentException.class, () -> customer.setGender(actual));
    }

    @Test
    public void testSetSales() {
        ArrayList<Sale> expected = new ArrayList<>();
        ArrayList<Sale> sales = new ArrayList<>();
        customer.setSales(sales);
        ArrayList<Sale> actual = customer.getSales();
        assertEquals(expected, actual);
    }
}