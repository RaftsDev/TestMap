package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("The stream after applying "
                + "the function is : ");

        List<String> list = Arrays.asList("geeks", "gfg", "g",
                "e", "e", "k", "s");
        System.out.println("Print a list arrayList: "+list);

        List<String> answer = list.stream().map(String::toUpperCase).
                collect(Collectors.toList());
        // displaying the new stream of UpperCase Strings
        System.out.println("Result: "+answer);

        //************************


    }
}
