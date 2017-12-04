package com.patricktcoakley.day2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenChecksumCheckerTest {
    @Test
    public void singleLine() throws Exception {
        EvenChecksumChecker evenChecksumChecker = new EvenChecksumChecker();
        assertEquals(4, evenChecksumChecker.check("5 9 2 8\n"));
    }

    @Test
    public void twoLines() throws Exception {
        EvenChecksumChecker evenChecksumChecker = new EvenChecksumChecker();
        assertEquals(7, evenChecksumChecker.check("5 9 2 8\n9 4 7 3\n"));
    }

    @Test
    public void threeLines() throws Exception {
        EvenChecksumChecker evenChecksumChecker = new EvenChecksumChecker();
        assertEquals(9, evenChecksumChecker.check("5 9 2 8\n9 4 7 3\n3 8 6 5\n"));
    }
}
