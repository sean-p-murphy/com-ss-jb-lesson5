package com.ss.jb.lesson5page2assignment3.assignment3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment3Application {

	public List<Integer> doubling(List<Integer> list) {
		return list.stream().map(n -> n * 2).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		Assignment3Application tester = new Assignment3Application();

		System.out.println(tester.doubling(Arrays.asList(1, 2, 3)));
		System.out.println(tester.doubling(Arrays.asList(6, 8, 6, 8, -1)));
		System.out.println(tester.doubling(Arrays.asList()));
	}

}

