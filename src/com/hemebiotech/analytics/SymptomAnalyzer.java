package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;

public class SymptomAnalyzer implements ISymptomAnalyzer
{
    ArrayList<String> list;

    SymptomAnalyzer(ArrayList<String> list) {   this.list = list;   }

    @Override
    public HashMap<String, Integer> analyze()
    {
        HashMap<String, Integer> result = new HashMap<>();

        for (int i=0; i < list.size(); i++)
        {
            if (result.containsKey(list.get(i)))
                result.put(list.get(i), result.get(list.get(i))+1);
            else
            {
                result.put(list.get(i), 1);
            }
        }

        return result;
    }

    public ArrayList<String> getList()
    {
        return list;
    }

    public void setList(ArrayList<String> list)
    {
        this.list = list;
    }
}
