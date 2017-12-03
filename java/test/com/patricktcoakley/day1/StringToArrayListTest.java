package com.patricktcoakley.day1;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StringToArrayListTest {

    @Test
    public void aSimpleString() throws Exception {
        StringToArrayList sta = new StringToArrayList("1122");
        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 1, 2, 2)), sta.stringToArray());
    }

    @Test
    public void aLongerString() throws Exception {
        StringToArrayList sta = new StringToArrayList("12131415");
        assertEquals(new ArrayList<Integer>(Arrays.asList(1, 2, 1, 3, 1, 4, 1, 5)), sta.stringToArray());
    }


}
