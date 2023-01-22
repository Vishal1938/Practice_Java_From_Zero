package com.company;

import java.sql.ResultSet;

class oracleDriver{
    static {
        System.out.println("staic in oracle driver");
        Drivermanger DM=new Drivermanger();
    }

}
class Drivermanger {
    public static void registerdriver() {
        System.out.println("registerdriver in DM");
    }

    public static void Deragisterdriver() {
        System.out.println("Deregister in Dm");
    }

    public static connection getcoonection(String url) {
        System.out.println("connection in Dm");
        return new oracleconnection();
    }
}
interface connection {
    public statement createstatement(int a);

    public statement createstatement(int a, int b);

    public statement createstatement(int a, int b, int c);

    public preparedstatement preparestatement(String sql);

    public preparedstatement preparestatement(String sql, int a, int b);

    public preparedstatement preparestatement(String sql, int a, int b, int c);

    public callablestatement preparecall(String sql);

    public callablestatement preparecall(String sql, int a, int b);

    public callablestatement preparecall(String sql, int a, int b, int c);
}
interface statement {
    public int executeUpdate(String sql1);
    public boolean execute(String sql2);
//    public ResultSet executeQuery(String sql3);
}
interface preparedstatement {
    public int excuteUpdate ();
    public boolean execute();
 //   public ResultSet executeQuery();
}
interface callablestatement {
    public int excuteUpdate ();
    public boolean execute();
 //   public ResultSet executeQuery();

}
interface Resultset{
    public int getint(int coloumnindex);
    public int getint(String coloumnindex);
    public String getString(int colomunidex);
    public String getString(String colomnname);

}
class oracleconnection implements connection{
    public statement createstatement(int a){
        System.out.println("createstatment");
        return new oracleStatement();
    }
    public statement createstatement(int a,int b){
        System.out.println("Createstatement(int a,int b)");
        return new oracleStatement();
    }
    public statement createstatement(int a,int b,int c){
        System.out.println("Createstaement(int a,int b,int c");
        return new oracleStatement();
    }
    public preparedstatement preparestatement(String sql){
        System.out.println("preparestatement (string sql");
       return new oraclepreparedstatement();
    }
    public preparedstatement preparestatement(String sql,int a,int b){
        System.out.println("prepaaredstatement(string sql, int a,int b");
        return new oraclepreparedstatement();
    }
    public preparedstatement preparestatement(String sql,int a,int b,int c){
        System.out.println("Preparedstatement (string sql, int a, int b,int c");
        return new oraclepreparedstatement();
    }
    public callablestatement preparecall(String sql){
        System.out.println("preparecall(string)");
        return new oraclecallablestatement();
    }
    public callablestatement preparecall(String sql,int a,int b){
        System.out.println("preparecall(string sql,int a,int b");
        return new oraclecallablestatement();
    }
    public callablestatement preparecall(String sql,int a,int b,int c){
        System.out.println("preparecall(string sql,int a,int b,int c");
        return new oraclecallablestatement();
    }

}
class oracleStatement implements statement {
    public int executeUpdate(String sql1) {
        System.out.println("to submit insert or update or delete or select sql statement");
        return 11;
    }

    public boolean execute(String sql2) {
        System.out.println("to submit insert,update,delete or select sql statement");
        return true;
    }

   /* public Resultset executeQuery(String sql3) {
        System.out.println("to submit select sql statement");
        return new oracleResultset();
    }*/
}
class oraclepreparedstatement implements preparedstatement{
    public int excuteUpdate (){
        System.out.println("int excuteupdate in preparedstatement");
        return 11;
    }
    public boolean execute(){
        System.out.println("boolean excute in preparement");
        return true;
    }
   /* public Resultset executeQuery(){
        System.out.println("Resultset in preparedstement");
        return new oracleResultset();
    }*/
}
class oraclecallablestatement implements callablestatement {
    public int excuteUpdate() {
        System.out.println("int excute in oraclecallablestatement");
        return 22;
    }

    public boolean execute() {
        System.out.println("boolean excute in oraclecallaablestatement ");
        return true;
    }

   /* public Resultset executeQuery() {
        System.out.println("Resultset excute in oraclecallablestaatement");
        return (Resultset)new oracleResultset();
    }*/
}
class oracleResultset implements Resultset{
    public int getint(int coloumnindex){
        System.out.println("=============");
        return 44;
    }
    public int getint(String coloumnindex){
        System.out.println("----------------");
        return 55;
    }
    public String getString(int colomunidex){
        System.out.println("**************");
        return "7777";
    }
    public String getString(String colomnname){
        System.out.println("##############");
        return "  ";
    }

}
public class jdbc {
   public static void main(String[] args) {

    }
}
