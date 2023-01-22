package com.company;
class MyEmployee1{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }

}

public class vishal_geters_setters {
    public static void main(String[] args) {
        MyEmployee1 vishal = new MyEmployee1();
        vishal.setName("vishalwebdeveloper");
        System.out.println(vishal.getName());
        vishal.setId(1316110229);
        System.out.println(vishal.getId());

    }
}
