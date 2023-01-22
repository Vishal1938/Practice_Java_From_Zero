package com.JavaEight;

import java.util.function.Consumer;
class Movie{
    String name;
    Movie(String name){
        this.name=name;
    }
}
public class ConsumerChaining {
    public static void main(String[] args) {
        Consumer<Movie> c1=m1-> System.out.println(m1.name+": ready to release");
        Consumer<Movie> c2=m-> System.out.println(m.name+": realeased but it is bigger flop");
        Consumer<Movie> c3=m-> System.out.println(m.name+": storing information in database");
        Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
        Movie m=new Movie("Batman");
        cc.accept(m);
    }
}
