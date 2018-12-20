package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharTypeTest {

    private CharType charTypeObj;
    @Before
    public void setUp() throws Exception {
        charTypeObj = new CharType();

    }

    @After
    public void tearDown() throws Exception {
        charTypeObj = null ;
    }
    @Test
    public void charType(){
        assertEquals("Small letter.",charTypeObj.charType("b"));
        assertEquals("Capital letter.",charTypeObj.charType("S"));
        assertEquals("Digit.",charTypeObj.charType("9"));
        assertEquals("Special character.",charTypeObj.charType("/"));
        assertEquals("false",charTypeObj.charType(""));


    }
}