package com.hemebiotech.analytics;

import java.util.*;

public class AnalyticsCounter
{
    public static void main(String[] args)
    {
        ISymptomReader symptomReader = new SymptomReader();
        try
        {
            //Get symptoms list from SymptomReader
            List<String> symptomsList= symptomReader.getSymptoms("symptoms.txt");

            //Count symptoms by type and organize them alphabetically
            symptomsList = new SymptomAnalyzer().analyze(symptomsList);

            //Output Symptoms list
            new OutputWriter().writeOutput(symptomsList);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
