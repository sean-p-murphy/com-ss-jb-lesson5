package com.ss.jb.lesson5page2assignment4.assignment4;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment4Application {

	public List<String> noX(List<String> list) {
		return list.stream().map(s -> {
			char[] letterArray = s.toCharArray();
			String result = "";
			for (char letter : letterArray) {
				if (letter != 'x') {result = result + letter;}
			};
			return result;
		}).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		Assignment4Application tester = new Assignment4Application();

		System.out.println(tester.noX(Arrays.asList("ax", "bb", "cx")));
		System.out.println(tester.noX(Arrays.asList("xxax", "xbxbx", "xxcx")));
		System.out.println(tester.noX(Arrays.asList("x")));
	}

}
