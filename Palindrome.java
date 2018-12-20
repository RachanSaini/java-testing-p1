package com.stackroute;

public class Palindrome {

    public String palindrome(int n){

        int number = n;
        int reverse = 0;

        int rem;
        while(n!=0){
            rem = n%10;
            reverse = (reverse*10)+rem;
            n=n/10;
        }
        if(reverse == number){
            return("Given number is a palindrome.");

        }
        else {
            return("Given number is not a Palindrome.");
        }
    }
}
