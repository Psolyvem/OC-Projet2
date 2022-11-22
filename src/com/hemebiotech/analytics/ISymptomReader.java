package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * <p>
 * It can process the raw list of symptoms in an ordered list with no duplications and the count of occurrences.
 */
public interface ISymptomReader
{
    /**
     * If no data is available, return an empty List
     *
     * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
     */
    List<String> getSymptoms(String filepath) throws IOException;

    /**
     * Count the occurrences of a String in a list and map them with their count, then order the list alphabetically.
     * @return A String List where every unique line in the input is a String mapped to the count of its occurrences
     */
    ArrayList<String> analyze(List<String> list);
}
