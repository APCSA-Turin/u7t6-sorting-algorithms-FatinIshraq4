package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        //int count=0;
        for (int i=1; i<elements.length; i++) {
            int cur = elements[i];
            int z = i;
            while (z>0 && cur<elements[z-1]) {
                //count++;
                elements[z]=elements[z-1];
                z--;
            }
            elements[z]=cur;
        }
        //System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return elements;
    }

    /*
    public static void main(String[] args) {
        int[] arrA = {73, 99, 13, 68, 62, 30, 77, 52, 58, 23, 31, 20, 75, 60, 8, 19, 14, 4, 45, 80, 57, 92, 16, 3};
        InsertionSort.selectionSort(arrA);
        System.out.println(Arrays.toString(arrA));
        System.out.println();
        int[] arrB = {73, 99, 13, 68, 62, 30, 77, 52, 58, 23, 31, 20, 75, 60, 8, 19, 14, 4, 45, 80, 57, 92, 16, 3};
        InsertionSort.insertionSort(arrB);
        System.out.println(Arrays.toString(arrB));
    }
    */

    public static int[] selectionSort(int[] elements) {
        //int count=0;
        for (int i=0; i<elements.length-1; i++) {
            int min=i;
            for (int x=i+1; x<elements.length; x++) {
                //count++;
                if (elements[x]<elements[min]) {
                    min=x;
                }
            }
            int temp = elements[i];
            elements[i]=elements[min];
            elements[min]=temp;
        }
        //System.out.println("SELECTION SORT: Number of loop iterations: " + count);
        return elements;
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int count=0;
        for (int i=1; i<words.size(); i++) {
            String cur = words.get(i);
            int z = i;
            while (z>0 && cur.compareTo(words.get(z-1))<0) {
                count++;
                words.set(z, words.get(z-1));
                z--;
            }
            words.set(z, cur);
        }
        System.out.println("INSERTION SORT: Number of loop iterations: " + count);
        return words;
    }

    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        int count=0;
        for (int i=0; i<words.size()-1; i++) {
            int min=i;
            for (int x=i+1; x<words.size(); x++) {
                count++;
                if (words.get(x).compareTo(words.get(min))<0) {
                    min=x;
                }
            }
            String temp = words.get(i);
            words.set(i, words.get(min));
            words.set(min, temp);
        }
        System.out.println("SELECTION SORT: Number of loop iterations: " + count);
        return words;
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }


}