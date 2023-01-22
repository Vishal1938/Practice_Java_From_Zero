package com.JavaEight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class player {
    private String firstName = null;
     private String lastName = null;
    private String position = null;
    private int status = -1;
    private int  run;

    public player() {

    }

    public player(String position, int status) {
        this.position = position;
        this.status = status;
    }

    protected String playeratatus() {
        String returnValue = null;
        switch (getStatus()) {
            case 0:
                returnValue = "ACTIVE";
            case 1:
                returnValue = "INACTIVE";
            case 2:
                returnValue = "INJURY";
            default:
                returnValue = "ON_BENCH";
        }
        return returnValue;
    }

    public String playerString() {
        return  getFirstName()+" "+getLastName()+" "+getPosition();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setrun(int run) {
        this.run = run;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public int getStatus() {
        return status;
    }

    public int getrun() {
        return run;
    }
}

public class Workbook_5 {
    static List<player> team;
    private static void loadTeam(){
        System.out.println("Loading team....");
        team=new ArrayList<player>();
        System.out.println("*****First Player********");
        player player1=new player();
        player1.setFirstName("Vishal");
        player1.setLastName("Kausik");
        player1.setPosition("Opener");
        player1.setrun(183);

        System.out.println("****Second Player********");
        player player2=new player();
        player2.setFirstName("Rajat");
        player2.setLastName("Gupta");
        player2.setPosition("Non-striker");
        player2.setrun(53);

        System.out.println("****Third Player********");
        player player3=new player();
        player3.setFirstName("Rahul");
        player3.setLastName("Verma");
        player3.setPosition("Second down");
        player3.setrun(73);

        System.out.println("****Fourth Player********");
        player player4=new player();
        player4.setFirstName("Sonu");
        player4.setLastName("Singh");
        player4.setPosition("Third down");
        player4.setrun(42);

        System.out.println("****Fifth Player********");
        player player5=new player();
        player5.setFirstName("Mayank");
        player5.setLastName("Senger");
        player5.setPosition("Fourth down");
        player5.setrun(123);


        team.add(player1);
        team.add(player2);
        team.add(player3);
        team.add(player4);
        team.add(player5);

    }

    public static void main(String[] args) {
        loadTeam();
        Comparator<player> byrun=Comparator.comparing(player::getrun);
        System.out.println("====Sort by Number of Runs====");
        team.stream().sorted(byrun).map(p->p.getFirstName()+" "+ p.getLastName()+" "+p.getrun()).
                forEach(element-> System.out.println(element));
        System.out.println("=====Sort by Last name=====\n");
        Collections.sort(team,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
        team.stream().forEach((p)->{
            System.out.println(p.getLastName());
        });
    }
}
