package com.platzi.javatest.util;

public class Stirngutil {

    public static String repeat(String str, int time){

        String s = " ";

        for (int i = 0; i < time; i++) {
            s+=str;
        }

        return s;
    }

}
