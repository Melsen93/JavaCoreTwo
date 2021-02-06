package hw3;

import java.util.*;

public class DistinctWords {

    public static void main(String[] args) {
        String[] words = {"Mother", "Passion", "Asphodel", "Fawn", "Anemone", "Golden", "Passion", "Asphodel", "Fawn", "Anemone", "Fawn", "Fawn"};
        Set<String> distinctWords = new HashSet<>(Arrays.asList(words));
        System.out.println(distinctWords);
        System.out.println(numberOfTimes(words));
    }

    public static Map<String, Long> numberOfTimes(String[] args) {

        Map<String, Long> numberOfTimesMap = new HashMap<>();
        for (String s : args) {
            if (!numberOfTimesMap.containsKey(s)) {
                numberOfTimesMap.put(s, 1L);
            } else {
                numberOfTimesMap.put(s, numberOfTimesMap.get(s) + 1);
            }
        }
        return numberOfTimesMap;
    }
}






