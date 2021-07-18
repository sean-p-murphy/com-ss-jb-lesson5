package com.ss.jb.lesson5page1assignment1.assignment1;
import java.util.Arrays;

public class Assignment1Application {

	public static void printWords(String [] arr) {
		for (String word : arr) {System.out.println(word);};
	};

	public static void main(String[] args) {
		String[] testArray = {"pig", "horse", "elephant", "rabbit"};

		Arrays.sort(testArray, (s1, s2) -> Utils.sortByLength(s1, s2));
		System.out.println("SORTED BY LENGTH");
		printWords(testArray);
		System.out.println();

		Arrays.sort(testArray, (s1, s2) -> Utils.sortByReverseLength(s1, s2));
		System.out.println("SORTED BY REVERSE LENGTH");
		printWords(testArray);
		System.out.println();

		Arrays.sort(testArray, (s1, s2) -> Utils.sortByFirstLetter(s1, s2));
		System.out.println("SORTED BY FIRST LETTER");
		printWords(testArray);
		System.out.println();

		Arrays.sort(testArray, (s1, s2) -> Utils.sortByLetterE(s1, s2));
		System.out.println("SORTED BY THE LETTER E");
		printWords(testArray);
		System.out.println();
	};

}
