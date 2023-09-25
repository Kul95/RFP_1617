package com.Practice.Assignment;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String str1="Look".toLowerCase();
        String str2="Kool".toLowerCase();
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(str1.length()==str2.length()){
            boolean result=Arrays.equals(ch1,ch2);
            if(result){
                System.out.println("Anagram string");
            }else {
                System.out.println("Not a anagram string");
            }
        }
    }
}
