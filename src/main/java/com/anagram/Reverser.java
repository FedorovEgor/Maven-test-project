package com.anagram;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringJoiner;

public class Reverser {

    public String letterAnagramProducer(String initialString) {

        String[] stringArray = initialString.split(" ");
        StringJoiner stringJoiner = new StringJoiner(" ","", "");

        for (String eachString : stringArray) {
            Deque<Character> stack = new ArrayDeque<>();


            for (char currentCharacter : eachString.toCharArray()) {
                if (Character.isLetter(currentCharacter))
                    stack.push(currentCharacter);
            }

            StringBuilder reversedSubstring = reverseWord(eachString, stack);
            stringJoiner.add(reversedSubstring);
        }

        return stringJoiner.toString();
    }


    private StringBuilder reverseWord(String eachString, Deque<Character> stack) {
        StringBuilder reversedSubstring = new StringBuilder();
        for (char c : eachString.toCharArray()) {
            if (Character.isLetter(c))
                reversedSubstring.append(stack.pop());
            else
                reversedSubstring.append(c);
        }
        return reversedSubstring;
    }
}

