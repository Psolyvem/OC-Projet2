package com.hemebiotech.analytics;

/**
 * Classes that will write data in an external file
 */

public interface IOutputWriter
{
    /**
     * Must write a given input in an external file
     */
    void writeOutput();
}