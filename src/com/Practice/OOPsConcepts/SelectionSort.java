package com.Practice.OOPsConcepts;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 8, 6, 9, 7, 4};
        int min;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
