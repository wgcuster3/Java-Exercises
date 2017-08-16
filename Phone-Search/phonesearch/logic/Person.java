/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonesearch.logic;

import java.util.*;

/**
 *
 * @author Wesley
 */
public class Person implements Comparable<Person> {
 
    private String name;
    private Set<String> phoneNumbers;
    private String street;
    private String city;
 
    public Person(String name) {
        this.name = name;
        phoneNumbers = new TreeSet<String>();
    }
 
    public String getStreet() {
        return street;
    }
 
    public void setAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }
 
    public String getCity() {
        return city;
    }
    public String getName() {
        return name;
    }
 
    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }
 
    public void addPhoneNumber(String number) {
        phoneNumbers.add(number);
    }
 
    @Override
    public String toString() {
        return name + " " + phoneNumbers;
    }
 
    @Override
    public int compareTo(Person t) {
        return name.compareTo(t.name);
    }
 
}
