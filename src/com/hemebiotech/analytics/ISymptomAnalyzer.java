package com.hemebiotech.analytics;

import java.util.HashMap;

/**
 * Takes a List of Strings and analyze the redundancies to output an organized map
 * with a value paired to a String representing the number of occurrences of the String in the input.
 */
public interface ISymptomAnalyzer
{
    /**
     * Count the occurrences of a String in a list and map them with their count.
     * @return A map String, Integer where every unique line in the input is a String mapped to the count of its occurrences
     */
    HashMap<String, Integer> analyze();
}
