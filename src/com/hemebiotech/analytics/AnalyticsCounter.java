package com.hemebiotech.analytics;

import java.util.*;

public class AnalyticsCounter
{
    public static void main(String[] args) throws Exception
    {
        //Get symptoms list from SymptomReader
        SymptomReader reader = new SymptomReader("symptoms.txt");
        ArrayList<String> symptomsList= new ArrayList<>(reader.GetSymptoms());

        //Count symptoms by type TODO: and organize them alphabetically
        SymptomAnalyzer analyzer = new SymptomAnalyzer(symptomsList);
        HashMap<String, Integer> symptomsAnalyzed = new HashMap<>(analyzer.analyze());


        //Output Symptoms list
        OutputWriter writer = new OutputWriter(symptomsList);
        writer.writeOutput();
    }
}
