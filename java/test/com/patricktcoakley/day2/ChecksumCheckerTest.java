package com.patricktcoakley.day2;

import org.junit.Test;

import static org.junit.Assert.*;


public class ChecksumCheckerTest {
    @Test
    public void smallGrid() throws Exception {
        ChecksumChecker checksumChecker = new ChecksumChecker();
        assertEquals(18, checksumChecker.check("5 1 9 5\n7 5 3\n2 4 6 8"));
    }

    @Test
    public void longerLine() throws Exception {
        ChecksumChecker checksumChecker = new ChecksumChecker();
        assertEquals(946, checksumChecker.check
                ("525\t333\t44\t150\t990\t343"));
    }

    @Test
    public void multipleLines() throws Exception {
        ChecksumChecker checksumChecker = new ChecksumChecker();
        assertEquals(1892, checksumChecker.check
                ("525\t333\t44\t150\t990\t343\n525\t333\t44\t150\t990\t343"));
    }


}
