package org.example;

public class StringUtilities {
    // Refer to Java Basics 1 for common string methods

    // Add a static function called shortString that takes a String parameter and returns true if the string has fewer than 5
    // characters
    public static boolean shortString(String par) {
        return par.length() < 5;
    }
    // Add a static function called firstLetter that takes a String parameter and returns the first character of the string
    public static char firstLetter(String par) {
        return par.charAt(0);
    }
    // Add a static function called censorAsparagus that takes a String parameter and returns the string with all instances of
    // "asparagus" (lowercase only) replaced with 4 stars: "****"
    public static String censorAsparagus(String par) {
        return par.replace("asparagus", "****");
    }
    // Add a static function called bigger that takes two String parameters and returns the longer of the two strings. If the
    // strings are the same length, return the first string.
    public static String bigger(String par1, String par2) {
        return (par1.length() >= par2.length()) ? par1 : par2;
    }
}
