package com.ss.jb.lesson5part2assignment2.assignment2;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment2Application {

	public List<Integer> rightDigit(List<Integer> list) {
		return list.stream().map(n -> {
			String s = String.valueOf(n);
			int l = s.length();
			return Integer.parseInt(String.valueOf(s.charAt(l - 1)));
		}).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		Assignment2Application tester = new Assignment2Application();

		System.out.println(tester.rightDigit(Arrays.asList(1, 22, 93)));
		System.out.println(tester.rightDigit(Arrays.asList(16, 8, 886, 8, 1)));
		System.out.println(tester.rightDigit(Arrays.asList(10, 0)));
	}

}
