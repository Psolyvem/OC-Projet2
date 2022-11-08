package com.hemebiotech.analytics;

import java.util.ArrayList;

/**
 * Takes a List of Strings and analyze the redundancies to output the list with one line for each symptom and
 * the number of times it encountered it in the list
 */
public interface ISymptomAnalyzer
{
    /**
     * Count the occurrences of a String in a list and map them with their count, then order the list alphabetically.
     * @return A String List where every unique line in the input is a String mapped to the count of its occurrences
     */
    ArrayList<String> analyze();
}
