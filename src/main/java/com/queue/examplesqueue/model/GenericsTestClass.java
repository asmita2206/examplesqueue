package com.queue.examplesqueue.model;

import java.util.*;

public class GenericsTestClass {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();

        list.add(1);
       // list.add("2"); compile time error with String
        list.add(2);
        System.out.println(list);

        Map<String,Integer> map=new HashMap<>();

        map.put("Aasha",1);
        //map.put(1,"asha"); compile time error
        map.put("Surekha",2);
        map.put("ANITA",2);

        System.out.println(map);

        Set<String> set= new HashSet<>();
        set.add("ashish");
        //set.add(1); compile time error
        set.add("asmi");

        System.out.println(set);

        GenericsClass<Integer> genericsClass =new GenericsClass<>();
        genericsClass.setAge(12);
        System.out.println( genericsClass.getAge());

        GenericsClass<String> genericsClass1 = new GenericsClass<>();
        genericsClass1.setAge("21");
        System.out.println(genericsClass1.getAge());
    }


}

class GenericsClass<T>{

    T age;

    public GenericsClass(){}

    public GenericsClass(T age){
        this.age = age;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}
