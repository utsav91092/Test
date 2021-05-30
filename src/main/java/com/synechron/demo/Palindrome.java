package com.synechron.demo;

public class Palindrome {

    public boolean isPalindrome(String str) {
        boolean isPalindrome = false;
        String rev = "";
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            rev = rev + arr[i];
        }
        if (str.equals(rev)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
