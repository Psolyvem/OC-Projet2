package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SymptomAnalyzer implements ISymptomAnalyzer
{
    ArrayList<String> list;

    SymptomAnalyzer(ArrayList<String> list) {   this.list = list;   }

    @Override
    public ArrayList<String> analyze()
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

    public ArrayList<String> getList()
    {
        return list;
    }

    public void setList(ArrayList<String> list)
    {
        this.list = list;
    }
}
