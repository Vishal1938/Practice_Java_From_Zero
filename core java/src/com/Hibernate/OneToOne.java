package com.Hibernate;
class Customer{
    int cid;
    String firstName;
    String lastName;
    String email;
    String phone;
    Address address;
    public Customer(){}
    public Customer(int cid,String firstName,String lastName,String email,String phone,Address address){
        this.cid=cid;
        this.lastName=lastName;
        this.firstName=firstName;
        this.email=email;
        this.phone=phone;
    }


    public void setCid(int cid) {
        this.cid = cid;
    }
    public int getCid() {
        return cid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString(){
        return "Id :"+ cid +" FirstName : "+firstName+" LastNamen :"+lastName+" phone :"+phone+" Email :"+email
                +"\n"+"Address :"+address.aid+"\t"+address.Street+"\t"+address.city+"\t"+address.state;
    }
}
public class OneToOne {
    public static void main(String[] args) {
        Customer cust=new Customer();
        cust.setCid(001);
        cust.setFirstName("vishal");
        cust.setLastName("singh");
        cust.setEmail("Vsingh19349");
        cust.setPhone("8765432");
        Address address =new Address();
        address.setAid(44);
        address.setStreet("Kadam chauraha,");
        address.setCity("Ballia,");
        address.setState("Uttarpradesh");
        cust.setAddress(address);
        System.out.println(cust.toString());
    }
}
