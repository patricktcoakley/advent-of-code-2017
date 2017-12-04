package com.patricktcoakley.day2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/com/patricktcoakley/day2/input.txt");
        String input = new String(java.nio.file.Files.readAllBytes(path));
        ChecksumChecker checksumChecker = new ChecksumChecker();
        EvenChecksumChecker evenChecksumChecker = new EvenChecksumChecker();
        System.out.println("Solution one: " + checksumChecker.check(input));
        System.out.println("Solution two: " + evenChecksumChecker.check(input));
    }
}
