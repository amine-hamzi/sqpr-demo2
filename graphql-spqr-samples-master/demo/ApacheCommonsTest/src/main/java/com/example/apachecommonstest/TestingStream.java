package com.example.apachecommonstest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestingStream {
    public static void main(String args[]){
        List<String> list = new ArrayList<String>();
        list.add("s1");
        list.add("s2");
        list.add("s3");
        list.add("s4");
        List<String> l = list.stream().filter(s -> s.contains("s1")).map(s -> "123").collect(Collectors.toList());
        l.forEach(System.out::println);

    }
}
