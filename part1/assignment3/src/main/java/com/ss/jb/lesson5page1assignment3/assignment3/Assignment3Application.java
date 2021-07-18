package com.ss.jb.lesson5page1assignment3.assignment3;
import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Assignment3Application {

	public static Predicate<String> aAndLength = word -> (word.length() == 3 && word.charAt(0) == 'a');

	public static void main(String[] args) {

		List<String> names = Arrays.asList("and", "cow", "bagel", "add", "maple");

		List<String> result = names.stream().filter(aAndLength).collect(Collectors.toList());
		result.forEach(System.out::println);
		
	}

}
