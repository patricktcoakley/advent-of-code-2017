package com.patricktcoakley.day1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/com/patricktcoakley/day1/input.txt");
        String input = new String(java.nio.file.Files.readAllBytes(path));
        CaptchaChecker captchaChecker = new CaptchaChecker(input);
        InverseCaptchaChecker inverseCaptchaChecker = new InverseCaptchaChecker(input);
        System.out.println("Solution one: " + captchaChecker.checkNumbers());
        System.out.println("Solution two: " + inverseCaptchaChecker.checkNumbers());
    }
}
