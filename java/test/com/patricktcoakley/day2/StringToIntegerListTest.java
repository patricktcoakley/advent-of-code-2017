package com.patricktcoakley.day2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StringToIntegerListTest {
    @Test
    public void createListOfLists() throws Exception {
        StringToIntegerList stringToIntegerList = new StringToIntegerList();
        List<List<Integer>> testList = new ArrayList<>();
        testList.add(Arrays.asList(5,1,9,5));
        testList.add(Arrays.asList(7,5,3));
        testList.add(Arrays.asList(2,4,6,8));
        assertEquals(testList, stringToIntegerList.createList(
                "5 1 9 5\n7 5 3\n2 4 6 8"));
    }

}
