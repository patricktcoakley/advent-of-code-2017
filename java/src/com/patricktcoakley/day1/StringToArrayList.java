package com.patricktcoakley.day1;

import java.util.ArrayList;

public class StringToArrayList {
    private String toConvert;

    public StringToArrayList(String toConvert) {
        this.toConvert = toConvert;
    }

    public ArrayList<Integer> stringToArray() {
        ArrayList<Integer> returnList = new ArrayList<>();
        char[] chars = this.toConvert.toCharArray();
        for (char c : chars) {
            returnList.add(Integer.parseInt(Character.toString(c)));
        }
        return returnList;
    }
}
