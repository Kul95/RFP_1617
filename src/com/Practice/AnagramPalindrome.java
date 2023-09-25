package com.Practice;

import java.util.Arrays;

public class AnagramPalindrome {
    public static void main(String[] args) {
        String s1="121";
        String s2="121";
        if(s1.length()==s2.length()){
            char ch1[]=s1.toCharArray();
            char ch2[]=s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean result=Arrays.equals(ch1,ch2);
            if(result){
                System.out.println("Length given anagram");
            }else{
                System.out.println("String is not anagram.");
            }
        }

    }
}
