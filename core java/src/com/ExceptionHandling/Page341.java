package com.ExceptionHandling;

public class Page341 {
    public static final long GUEST_USER_ID=-1;
   /* private static final long USER_ID;
    static {
        try{
            USER_ID=getUsedidformEnvirnoment();
        }catch(IdUnavailableException e){
            USER_ID=GUEST_USER_ID; you cannot reassign a value to Final variable
            System.out.println("Logging in as a guest");
        }
    }
    private static long getUsedidformEnvirnoment()throws IdUnavailableException{
        throw new IdUnavailableException();
    }*/

    public static void main(String[] args) {
      //  System.out.println("user id :"+USER_ID);
    }
}
class IdUnavailableException extends Exception{
}