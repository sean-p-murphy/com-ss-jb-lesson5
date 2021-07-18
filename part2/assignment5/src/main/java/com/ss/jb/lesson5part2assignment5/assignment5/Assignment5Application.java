package com.ss.jb.lesson5part2assignment5.assignment5;
import java.util.ArrayList;
import java.util.List;

public class Assignment5Application {
	List<Integer> sums;
	boolean flag = false;

	public Assignment5Application(int[] arr, int answer) {
		sums = new ArrayList<>();
		getAllSums(findGroups(arr), 0, 0, answer);
		System.out.println(this.flag);
	}

	private Object[] findGroups(int[] numbers) {
		List<Integer> results = new ArrayList<>();
		int i = 0;
		while (i < numbers.length) {
			if (i + 1 < numbers.length && numbers[i] == numbers[i + 1]) {
				int group = 0;
				while (i+1 < numbers.length && numbers[i] == numbers[i+1]) {
					group = group + numbers[i];
					i++;
				};
				group = group + numbers[i];
				i++;
				results.add(group);
			} else {
				results.add(numbers[i]);
				i++;
			};
		};
		return results.toArray();
	};

	private void getAllSums(Object[] numbersArray, int starting, int sum, int answer) {
		for (int i = starting; i < numbersArray.length; i++) {
			int current = sum + (int)numbersArray[i];
			this.sums.add(current);
			if (this.sums.contains(answer)) {
				this.flag = true;
				break;
			} else {
				getAllSums(numbersArray, starting + 1, current, answer);
			}
		}
	};

	public static void main(String[] args) {
		int[] test1 = {5, 2, 2, 2, 2, 7, 8, 1, 1};
		int[] test2 = {2, 4, 8};
		int[] test3 = {1, 2, 4, 8, 1};
		int[] test4 = {2, 4, 4, 8};

		new Assignment5Application(test1, 15);
		new Assignment5Application(test2, 10);
		new Assignment5Application(test3, 14);
		new Assignment5Application(test4, 14);
	}

}
