package com.Practice.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

        List<String>list=new ArrayList<>();
        public void firstName(){
            list.add("Kuldeep");
            list.add("Johan");
            list.add("Harry");

        String regx="[a-za-z0-9]";
        Pattern pattern=Pattern.compile(regx);
        for(int i=0;i<list.size();i++){
            Matcher matcher=pattern.matcher(list.get(i));
            System.out.println(list.get(i)+" ");
    }}
    public static void main(String[] args) {
       RegularExpression regx=new RegularExpression();
       regx.firstName();
    }
}
