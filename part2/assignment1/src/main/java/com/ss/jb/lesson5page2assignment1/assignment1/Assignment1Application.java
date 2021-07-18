package com.ss.jb.lesson5page2assignment1.assignment1;

public class Assignment1Application {

	public void test(String info) {
		String[] arr = info.split(" ");
		if (arr.length == 2) {
			switch (Integer.parseInt(arr[0])) {
				case 1:
				System.out.println(isOdd(Integer.parseInt(arr[1])));
				break;
				case 2:
				System.out.println(isPrime(Integer.parseInt(arr[1])));
				break;
				case 3:
				System.out.println(isPalindrome(Integer.parseInt(arr[1])));
				break;
			}
		}
	}

	public String isOdd(int num) {
		return (num % 2 == 0) ? "EVEN" : "ODD";
	};

	public String isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		};
		return (flag) ? "PRIME" : "COMPOSITE";
	};

	public String isPalindrome(int num) {
		StringBuilder forward = new StringBuilder(String.valueOf(num));
		return (forward == forward.reverse()) ? "PALINDROME" : "NOT A PALINDROME";
	}

	public static void main(String[] args) {

		Assignment1Application tester = new Assignment1Application();
		tester.test("5");
		tester.test("1 4");
		tester.test("2 5");
		tester.test("3 898");
		tester.test("1 3");
		tester.test("2 12");
	}

}
