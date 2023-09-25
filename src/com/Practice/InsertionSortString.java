package com.Practice;

public class InsertionSortString {
        public static void main(String[] args) {
            String[] arr = {"apple", "banana", "cherry", "grape", "orange", "strawberry"};
            insertionSort(arr);
            System.out.println("Sorted Array:");
            for (String s : arr) {
                System.out.print(s + " ");
            }
        }
        public static void insertionSort(String[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                String key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j].compareTo(key) > 0) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }
    }
