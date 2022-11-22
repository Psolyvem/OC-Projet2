package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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

    /**
     * @param list A list of Strings containing the symptoms one by per line
     */
    @Override
    public ArrayList<String> analyze(List<String> list)
    {
        TreeMap<String, Integer> result = new TreeMap<>();

        for (String s : list)
        {
            s = s.toLowerCase();    //Ignore la casse
            if (result.containsKey(s))
                result.put(s, result.get(s) + 1);
            else
            {
                result.put(s, 1);
            }
        }

        ArrayList<String> listWithCount = new ArrayList<>();
        for (Map.Entry m : result.entrySet())
        {
            listWithCount.add(m.getKey() + " = " + m.getValue());
        }
        return listWithCount;
    }
}
