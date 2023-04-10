package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String s = "39847";
        Object[] objects = toArray(s);
        int pairs = 0;
        int impairs = 0;

        for (int i=0; i<objects.length; i++) {
            if(i%2==0){
                pairs = pairs+Integer.parseInt(objects[i].toString());
            }else {
                impairs = impairs+Integer.parseInt(objects[i].toString());
            }
        }

        int i = (pairs * 3) + impairs;
        Object lastDegit = getLAstDegit(i);
        var last = 0;
        if(Integer.parseInt(lastDegit.toString()) != 0){
            last = Integer.parseInt(lastDegit.toString());
            int i1 = 10 - last;
            System.out.println(i1);
        } else {
            System.out.println(0);
        }
    }

    private static Object[] toArray(String s) {
        List<Character> collect = s.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        return collect.toArray();
    }

    private static Object getLAstDegit(int impairs) {
        String s1 = String.valueOf(impairs);
        Object[] objects1 = toArray(s1);
        return objects1[objects1.length - 1];
    }
}
