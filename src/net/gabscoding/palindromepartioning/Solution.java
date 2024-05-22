package net.gabscoding.palindromepartioning;

import java.util.ArrayList;

class Solution {
    public static ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<ArrayList<String>> stringPartitioned = new ArrayList<>();
        int lowerBoundOfStringRule = 1;
        int upperBoundOfStringRule = 16;
        String hasNumberInString = ".*\\d.*";
        if (s.matches(hasNumberInString)) {
            return stringPartitioned;
        } else if (s.length() == lowerBoundOfStringRule) {
            stringPartitioned.add(createUnitaryPartitionsOf(s));
            return stringPartitioned;
        } else if (s.length() >= lowerBoundOfStringRule &&
                   s.length() <= upperBoundOfStringRule) {
            stringPartitioned.add(createUnitaryPartitionsOf(s));
            stringPartitioned.add(createLargerPartitionsOf(s));
        }
        return stringPartitioned;
    }

    private static ArrayList<String> createUnitaryPartitionsOf(String inputString) {
        ArrayList<String> unitaryPartition = new ArrayList<>();
        for (int i = 0; i < inputString.length(); i++) {
            unitaryPartition.add(String.valueOf(inputString.charAt(i)));
        }
        return unitaryPartition;
    }

    private static ArrayList<String> createLargerPartitionsOf(String s) {
        ArrayList<String> largerPartition = new ArrayList<>();
        String groupOfSameCharacter = "";
        for (int i = 0; i < s.length(); i++) {
            int hasGroupOfSameCharacters = s.lastIndexOf(String.valueOf(s.charAt(i)));
            if (hasGroupOfSameCharacters != -1) {

            }
        }
        return largerPartition;
    }

    public static void printPartionedList(ArrayList<ArrayList<String>> listPartioned) {
        for (ArrayList<String> partition : listPartioned) {
            System.out.println(partition);
        }
    }

    public static void main(String[] args) {
        String inputString = "aab";
        printPartionedList(partition(inputString));
    }
}