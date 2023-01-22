package com.ExceptionHandling;
class invaliduserException extends Exception{
    String userId;
    public invaliduserException(){
    }
    invaliduserException(String userId) {
        this.userId = userId;
    }
    public String toString(){
        return this.getClass().getName()+":"+getMessage();
    }
    public String getMessage(){
        return "userId\t"+userId+" :is invalid";
    }
}
class ServerbusyException extends RuntimeException{
}
class chatRoom{
    void startChat(String userId) {
        System.out.println("connecting to the chatroom");
        try {
        if (userId.equals("som123")) {
            System.out.println("welcome to chatroom...");
        }
                else{
                throw new invaliduserException(userId) ;
            }
        } catch (invaliduserException e) {
            System.out.println(e);
        }
    }
}
public class jtc118 {
    public static void main(String[] args) {
        chatRoom cr = new chatRoom();
        try {
            cr.startChat("vishal");
        } catch (Exception e) {
            if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("provide user id to chat");
            } else if (e instanceof NumberFormatException) {
                System.out.println("provide valid userid");
            }
        }
    }
}
