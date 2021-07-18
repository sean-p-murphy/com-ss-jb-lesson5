package com.ss.jb.lesson5page1assignment2.assignment2;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Assignment2Application {

	public static String evenOrOdd(List<Integer> numbers) {
		List<String> sortedList = numbers.stream().map(n -> {
			String result = new String();
			if (n % 2 == 0) {result = "e" + n;}
			else {result = "o" + n;};
			return result;
		}).collect(Collectors.toList());
		String[] sortedArray = new String[sortedList.size()];
		sortedList.toArray(sortedArray);
		return String.join(", ", sortedArray);
	}

	public static void main(String[] args) {
		List<Integer> test = Arrays.asList(10, 39, 653, 557, 1830652, 4328, 22, 174);
		System.out.println(evenOrOdd(test));
	}

}
