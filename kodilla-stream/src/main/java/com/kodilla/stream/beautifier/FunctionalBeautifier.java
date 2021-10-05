package com.kodilla.stream.beautifier;

public class FunctionalBeautifier {
    public static String upperCase(String text){
        String result = text.toUpperCase();
        return result;
    }

    public static String addStars(String text){
        String result = "*** " + text + " ***";
        return result;
    }

    public static String replacingUpperX(String text){
        String result = text.replace('x', 'X');
        return result;
    }

    public static String concatingText(String text){
        String result = text.concat(text);
        return result;
    }
}
