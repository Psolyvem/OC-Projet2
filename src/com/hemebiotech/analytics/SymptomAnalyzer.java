package com.hemebiotech.analytics;

import java.util.*;

public class SymptomAnalyzer implements ISymptomAnalyzer
{
    @Override
    public ArrayList<String> analyze(List<String> list)
    {
        HashMap<String, Integer> result = new HashMap<>();

        for (String s : list)
        {
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

        listWithCount.sort(Comparator.naturalOrder());
        return listWithCount;
    }
}
