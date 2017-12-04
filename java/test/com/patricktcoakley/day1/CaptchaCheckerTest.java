package com.patricktcoakley.day1;

import org.junit.*;

import static org.junit.Assert.*;

public class CaptchaCheckerTest {

    @Test
    public void twoPairs() throws Exception {
        CaptchaChecker ch = new CaptchaChecker("1122");
        assertEquals(3, ch.checkNumbers());
    }

    @Test
    public void fourOfTheSame() throws Exception {
        CaptchaChecker ch = new CaptchaChecker("1111");
        assertEquals(4, ch.checkNumbers());
    }

    @Test
    public void fourDifferentKinds() throws Exception {
        CaptchaChecker ch = new CaptchaChecker("1234");
        assertEquals(0, ch.checkNumbers());
    }

    @Test
    public void firstAndLast() throws Exception {
        CaptchaChecker ch = new CaptchaChecker("91212129");
        assertEquals(9, ch.checkNumbers());
    }

}
