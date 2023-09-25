package com.Practice.Assignment;

public class Regs2 {
    public static void main(String[] args) {
        String str="gautham.y@bridglabz.com";
        String regx="[a-z.@]+y@bridglabz.com";
        System.out.println(str.matches(regx));
    }
}
