package com.patricktcoakley.day1;

import java.util.ArrayList;

public class CaptchaChecker {
    private ArrayList<Integer> numbers = new ArrayList<>();

    public CaptchaChecker(String string) {
        this.numbers = new StringToArrayList(string).stringToArray();
    }

    public int checkNumbers() {
        int sum = 0;
        if (numbers.get(0) == numbers.get(numbers.size() - 1)) {
            sum += numbers.get(0);
        }
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                sum += numbers.get(i);
            }
        }
        return sum;
    }
}
