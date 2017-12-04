package com.patricktcoakley.day2;

import java.util.ArrayList;
import java.util.List;

public class StringToIntegerList {
    public List<List<Integer>> createList(String stringToCheck) {
        List<List<Integer>> parentList = new ArrayList<>();
        for (String line : stringToCheck.split("\\n")) {
            List<Integer> childList = new ArrayList<>();
            for (String digit : line.split("\\s+")) {
                childList.add(Integer.parseInt(digit));
            }
            parentList.add(childList);
        }
        return parentList;
    }
}
