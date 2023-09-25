package com.Practice.Assignment;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int li=0,hi=arr.length-1;
        int mid=(li+hi)/2;
        int key=8;
        while(li<hi){
        if(arr[mid]==key){
            System.out.println("Element found at index : "+mid+ " position");
            break;
        }else if(arr[mid]<key){
            li=mid+1;
        }else{
            hi=mid-1;
        }
        mid=(li+hi)/2;
    }
        if(li>hi){
            System.out.println("Element not found");
        }
}}
