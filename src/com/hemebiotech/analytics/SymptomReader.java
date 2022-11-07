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

    private String filepath;

    /**
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public SymptomReader(String filepath)
    {
        this.filepath = filepath;
    }

    @Override
    public List<String> GetSymptoms()
    {
        ArrayList<String> result = new ArrayList<>();

        if (filepath != null)
        {
            try
            {
                BufferedReader reader = new BufferedReader(new FileReader(filepath));
                String line = reader.readLine();

                while (line != null)
                {
                    result.add(line);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        else
        {
            System.out.println("No file given");
        }

        return result;
    }

    /**
     * Set the path of the file to read
     * @param filepath A String corresponding to the path of the file to read
     */
    public void setFilepath(String filepath)
    {
        this.filepath = filepath;
    }

    /**
     *
     * @return a String that contains the path to the read file
     */
    public String getFilepath()
    {
        return this.filepath;
    }
}
