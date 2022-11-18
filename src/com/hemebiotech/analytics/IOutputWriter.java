package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

/**
 * Classes that will write data in an external file
 */

public interface IOutputWriter
{
    /**
     * Must write a given input in an external file
     */
    void writeOutput(List<String> output) throws IOException;
}