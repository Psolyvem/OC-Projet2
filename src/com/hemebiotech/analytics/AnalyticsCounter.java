package com.hemebiotech.analytics;

import java.util.ArrayList;

public class AnalyticsCounter
{
    public static void main(String[] args) throws Exception
    {
        //Get symptoms list from SymptomReader
        SymptomReader reader = new SymptomReader("symptoms.txt");
        ArrayList<String> symptomsList= new ArrayList<>(reader.GetSymptoms());

        //TODO: Count symptoms by type and organize them alphabetically

        //TODO: Output Symptoms list
        OutputWriter writer = new OutputWriter(symptomsList);
        writer.writeOutput();
    }
}
