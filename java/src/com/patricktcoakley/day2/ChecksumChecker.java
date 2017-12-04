package com.patricktcoakley.day2;

import java.util.List;
import java.util.Collections;

public class ChecksumChecker {
    private StringToIntegerList stringToIntegerList = new StringToIntegerList();

    public int check(String stringToCheck) {
        int checksum = 0;
        List<List<Integer>> parentList = stringToIntegerList.createList(stringToCheck);
        for (List<Integer> childList : parentList) {
            checksum += Collections.max(childList) - Collections.min(childList);
        }
        return checksum;
    }
}
