package com.patricktcoakley.day2;

import java.util.List;

public class EvenChecksumChecker {
    private StringToIntegerList stringToIntegerList = new StringToIntegerList();

    public int check(String stringToCheck) {
        int checksum = 0;
        List<List<Integer>> parentList = stringToIntegerList.createList(stringToCheck);
        for (List<Integer> childList : parentList) {
            for (int i : childList) {
                for (int j : childList) {
                    if (i % j == 0 && i != j) {
                        checksum += i / j;
                    }
                }
            }
        }
        return checksum;
    }
}
