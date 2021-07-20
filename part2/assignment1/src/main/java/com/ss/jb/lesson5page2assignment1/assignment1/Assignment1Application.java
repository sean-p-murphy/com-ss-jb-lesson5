package com.ss.jb.lesson5page2assignment1.assignment1;

public class Assignment1Application {

	public static interface NumberTester {
		public String test(Integer num);
	}

	public void tester(String info) {

		NumberTester isOdd = (num) -> (num % 2 == 0) ? "EVEN" : "ODD";

		NumberTester isPrime = (num) -> {
			boolean flag = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			};
			return (flag) ? "PRIME" : "COMPOSITE";
		};

		NumberTester isPalindrome = (num) -> {
			StringBuilder forward = new StringBuilder(String.valueOf(num));
			return (forward == forward.reverse()) ? "PALINDROME" : "NOT A PALINDROME";
		};

		String[] arr = info.split(" ");
		if (arr.length == 2) {
			switch (Integer.parseInt(arr[0])) {
				case 1:
				System.out.println(isOdd.test(Integer.parseInt(arr[1])));
				break;
				case 2:
				System.out.println(isPrime.test(Integer.parseInt(arr[1])));
				break;
				case 3:
				System.out.println(isPalindrome.test(Integer.parseInt(arr[1])));
				break;
			}
		}
	}

	public static void main(String[] args) {

		Assignment1Application tester = new Assignment1Application();
		tester.tester("5");
		tester.tester("1 4");
		tester.tester("2 5");
		tester.tester("3 898");
		tester.tester("1 3");
		tester.tester("2 12");
	}

}
