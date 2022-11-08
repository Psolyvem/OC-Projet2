package com.hemebiotech.analytics;

import java.util.*;

public class AnalyticsCounter
{
    public static void main(String[] args)
    {
        try
        {
            //Get symptoms list from SymptomReader
            ArrayList<String> symptomsList= new ArrayList<>(new SymptomReader("symptoms.txt").GetSymptoms());

            //Count symptoms by type and organize them alphabetically
            symptomsList = new SymptomAnalyzer(symptomsList).analyze();

            //Output Symptoms list
            new OutputWriter(symptomsList).writeOutput();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
