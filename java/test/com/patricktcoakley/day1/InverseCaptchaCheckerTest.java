package com.patricktcoakley.day1;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class InverseCaptchaCheckerTest {
    @Test
    public void twoUnmatchedPairs() throws Exception {
        InverseCaptchaChecker ich = new InverseCaptchaChecker("1212");
        assertEquals(6, ich.checkNumbers());
    }

    @Test
    public void twoOfTheSame() throws Exception {
        InverseCaptchaChecker ich = new InverseCaptchaChecker("1221");
        assertEquals(0, ich.checkNumbers());
    }

    @Test
    public void noneInARow() throws Exception {
        InverseCaptchaChecker ich = new InverseCaptchaChecker("123425");
        assertEquals(4, ich.checkNumbers());
    }

    @Test
    public void twoSetsOfThree() throws Exception {
        InverseCaptchaChecker ich = new InverseCaptchaChecker("123123");
        assertEquals(12, ich.checkNumbers());
    }

    @Test
    public void iteratesByOne() throws Exception {
        InverseCaptchaChecker ich = new InverseCaptchaChecker("12131415");
        assertEquals(4, ich.checkNumbers());
    }

}
