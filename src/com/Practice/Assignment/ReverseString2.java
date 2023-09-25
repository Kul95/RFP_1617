package com.Practice.Assignment;

public class ReverseString2 {
    public static void main(String[] args) {
        String str="mom";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        if(str.equals(rev)){
            System.out.println("Palindrome String ");
        }else{
            System.out.println("Not a palindrome string");
        }
    }
}
