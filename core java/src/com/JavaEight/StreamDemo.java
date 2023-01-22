package com.JavaEight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<Integer>();
        marks.add(40);
        marks.add(32);
        marks.add(10);
        marks.add(85);
        marks.add(70);
        marks.add(95);
        System.out.println(marks);
        List<Integer> l2=marks.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);
        List<Integer> Updatedmarks=marks.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println("Updatedmarks :"+Updatedmarks);
        List<Integer> passedMarks=marks.stream().filter(m->m>=35).collect(Collectors.toList());
        System.out.println("Passes Student marks :"+passedMarks);
        long noofFailedStudents =marks.stream().filter(m->m<35).count();
        System.out.println("noofFailedStudents :"+noofFailedStudents);
        List<Integer> sortedList=marks.stream().sorted().collect(Collectors.toList());
        System.out.println("Natural sortedList :"+sortedList);
        List<Integer> sortedlist1=marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0)
                .collect(Collectors.toList());
        System.out.println("Customized sortedlist :"+sortedlist1);
        List<Integer> sortedlist2=marks.stream().sorted((i1,i2)->-i1.compareTo(i2))
                .collect(Collectors.toList());
        System.out.println("Customized sortedlist :"+sortedlist2);
        Integer min=marks.stream().min((i1,i2)->-i1.compareTo(i2)).get();
        System.out.println(min);
        Integer max=marks.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(max);
        Consumer<Integer> c=i->{
            System.out.println("The Square of "+i+"is :"+i+20);
        };
        marks.stream().forEach(c);
        Integer[] i=marks.stream().toArray(Integer[]::new);
        for(Integer i1:i){
            System.out.println("Stream to Array :"+i1);
        }
        Stream s=Stream.of(9,99,999,9999,99999);
        s.forEach(System.out::println);
        System.out.println("==============\n");
        Stream.of(i).forEach(System.out::println);
    }
}
