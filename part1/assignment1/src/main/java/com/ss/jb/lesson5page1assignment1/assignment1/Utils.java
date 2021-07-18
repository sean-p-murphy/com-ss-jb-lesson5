package com.ss.jb.lesson5page1assignment1.assignment1;

public class Utils {

	public static int sortByLength(String one, String two) {
        return one.length() - two.length();
    }

    public static int sortByReverseLength(String one, String two) {
        return two.length() - one.length();
    };

    public static int sortByFirstLetter(String one, String two) {
        return one.charAt(0) - two.charAt(0);
    };

    public static int sortByLetterE(String one, String two) {
        int b1 = one.contains("e") ? 1 : 0;
        int b2 = two.contains("e") ? 1 : 0;
        return b2 - b1;
    };

};
