package com.stackroute;



//import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private Palindrome palindromeObj;
    @Before
    public void setUp() throws Exception {
        palindromeObj = new Palindrome();
    }



    @Test
    public void palindrome() {

        assertEquals("Given number is a palindrome.",palindromeObj.palindrome(121));


        assertEquals("Given number is not a Palindrome.",palindromeObj.palindrome(2365));

    }


}
