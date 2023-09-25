package com.Practice;

import java.util.Scanner;

public class PrimeNumberGivenRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber=sc.nextInt();
        System.out.println("Enter the second number: ");
        int endNumber=sc.nextInt();
        int count=0;
        while (firstNumber<endNumber){
            boolean flag=false;
            for(int i=1;i<=firstNumber;i++){
                if(firstNumber%i==0){
                    flag=true;
                    break;
                }
            }
            if(!flag && firstNumber!=0 && firstNumber!=1){
                System.out.print(firstNumber+" ");
                ++firstNumber;
            }
        }

    }
}
