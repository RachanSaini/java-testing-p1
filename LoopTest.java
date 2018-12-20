package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class LoopTest {

    private Loop loopObj;
    @Before
    public void setUp() throws Exception {
        loopObj = new Loop();

    }

    @After
    public void tearDown() throws Exception {
        loopObj = null ;
    }

    @Test
    public void loop() {
        assertEquals("1223334444",loopObj.loop(4));
        assertEquals("1",loopObj.loop(1));
        assertEquals("122333",loopObj.loop(3));
    }
}