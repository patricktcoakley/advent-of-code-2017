package com.patricktcoakley.day1;

import java.util.ArrayList;

public class InverseCaptchaChecker {
    private ArrayList<Integer> numbers;

    public InverseCaptchaChecker(String string) {
        this.numbers = new StringToArrayList(string).stringToArray();
    }

    public int checkNumbers() {
        int sum = 0;
        int halfSize = numbers.size() / 2;
        for (int i = 0; i < numbers.size(); i++) {
            if (i + halfSize == numbers.size()) {
                halfSize = -i;
            }
            if (numbers.get(i) == numbers.get(i + halfSize)) {
                sum += numbers.get(i);
            }
        }
        return sum;
    }
}
