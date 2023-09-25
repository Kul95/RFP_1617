package com.Practice.Assignment;

public class ReverseString {
    public static void main(String[] args) {
        String str="Kuldeep0";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.print(rev);
    }
}
