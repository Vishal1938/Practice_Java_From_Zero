package com.Hibernate;

public class Address {
    int aid;
    String Street;
    String city;
    String state;
    Customer customer;
    Address(){}
    Address(int aid,String Street, String city,String state,Customer Customer){
        this.aid=aid;
        this.Street=Street;
        this.city=city;
        this.state=state;
        this.customer=customer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String toString(){
        return "Aid :"+aid+"Street :"+Street+"City :"+city+"State :"+state+"\n"+"customer :"+customer;
    }
}
