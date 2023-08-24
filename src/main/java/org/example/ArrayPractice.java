package org.example;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {

//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            numbers.add(i);
//        }
//
//        int summed = sumEven(numbers);
//        System.out.println(summed);

//        int[] integerArray = {1, 1, 2, 3, 5, 8};
//
//        for (int i : integerArray) {
//            if (i % 2 == 1) {
//                System.out.println(i);
//            }
//        }

//        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String[] words = phrase.split(" ");
//        System.out.println(Arrays.toString(words));
//
//        String[] sentences = phrase.split("\\.");
//        System.out.println(Arrays.toString(sentences));

        ArrayList<String> words = new ArrayList<>();
        words.add("There");
        words.add("Bye");
        words.add("Hi");
        words.add("Howdy");
        words.add("Ok");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of word: ");
        int lengthInput = input.nextInt();

        wordLen(words, lengthInput);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void wordLen(ArrayList<String> arr, int length) {
        for (String str : arr) {
            if (str.length() == length) {
                System.out.println(str);
            }
        }
    }



}
