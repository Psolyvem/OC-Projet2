package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OutputWriter implements IOutputWriter
{
    /**
     * Write the output in a .txt file, based on the list given in the constructor.
     * To change the list, use SetOutput
     */
    @Override
    public void writeOutput(List<String> output)
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            for (String s : output)
            {
                writer.write(s);
                writer.newLine();
            }
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("Unable to create output.txt");
        }
    }
}
