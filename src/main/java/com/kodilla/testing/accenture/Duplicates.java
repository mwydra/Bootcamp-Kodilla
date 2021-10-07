package com.kodilla.testing.accenture;

import java.util.*;

public class Duplicates {

    public List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> resultMap = new HashMap<>();

        for(int i=0; i<integers.size(); i++){
            int count = 0;
            int duplicate = 0;
            for(int j = 0; j<integers.size(); j++){
                if(integers.get(i) == integers.get(j)){
                    duplicate = integers.get(i);
                    count++;
                }
            }
            resultMap.put(duplicate, count);
        }

        for(Map.Entry entry : resultMap.entrySet()){
            if(entry.getValue().equals(numberOfDuplicates)){
                result.add((Integer) entry.getKey());
            }
        }
        return result;
    }
}
