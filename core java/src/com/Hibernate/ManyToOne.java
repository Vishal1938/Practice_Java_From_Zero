package com.Hibernate;
import java.util.*;

class Student{
    private Integer cid;
    private String firstName;
    private String lastName;
    private String email;
    private long phone;
    private List<Subject> subjects;

    Student (){}

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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


    public List<Subject> getList() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "Student id :" + cid + " First Name :" + firstName + " Last name :" + lastName + " Email :" + email +
                " Phone no :" + phone;
    }
}
class Subject {
    int subjectId;
    String name;
    int Totalmarks;
    Student student;

    Subject(){}
    Subject(int sid,String name,int marks,Student stu){
        this.subjectId=sid;
        this.name=name;
        this.Totalmarks=marks;
        this.student=stu;
    }

    public int getTotalmarks() {
        return Totalmarks;
    }

    public void setTotalmarks(int totalmarks) {
        Totalmarks = totalmarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String toString(){
        return "Subject 1:"+" s1- sid :"+subjectId+" Name :"+name+" Total Marks :"+Totalmarks;
    }
}

public class ManyToOne {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setCid(123);
        stu1.setFirstName("Vishal");
        stu1.setLastName("Singh");
        stu1.setEmail("vsingh19349@gmail.com");
        stu1.setPhone(87654321);
        System.out.println(stu1);
        System.out.println("****Setting the Subject****");
        Subject s1=new Subject(234,"Math",100,stu1);
        Subject s2=new Subject(235,"physics",80,stu1);
        Subject s3=new Subject(236,"Chemistrey",70,stu1);

        List<Subject> l=new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        stu1.setSubjects(l);

        Collection <Subject> col= stu1.getList();
        for(Subject sub:col){
            System.out.println(sub);
        }
    }
}
