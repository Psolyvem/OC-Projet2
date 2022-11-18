package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 */
public class SymptomReader implements ISymptomReader
{
    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    @Override
    public List<String> getSymptoms(String filepath) throws IOException
    {
        ArrayList<String> result = new ArrayList<>();

        if (filepath != null)
        {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line = reader.readLine();

            while (line != null)
            {
                result.add(line);
                line = reader.readLine();
            }
            reader.close();
        }
        else
        {
            System.out.println("No file given");
        }

        return result;
    }
}
