package com.Practice;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchWordList {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("banana");
        wordList.add("cherry");
        wordList.add("grape");
        wordList.add("orange");
        wordList.add("strawberry");
        Collections.sort(wordList);
        String target = "cherry";
        int index = binarySearch(wordList, target);
        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found in the list.");
        }
    }

    public static int binarySearch(ArrayList<String> list, String target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = list.get(mid).compareTo(target);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

