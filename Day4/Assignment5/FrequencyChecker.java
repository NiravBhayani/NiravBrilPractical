package Day4.Assignment5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyChecker {

    public void checkFrequency(String[] words) {
        // ["aara","arrraa","sajgdsad"]
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        TreeMap<String, Integer> sortedMap = new TreeMap<>(frequencyMap);

        // check hoe to print whole tree and map
        System.out.print("{");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + ",");
        }
        System.out.println("}");
    }

        public static void main(String[] args){
        //use list or array
        if(args.length == 0){
            System.out.println("Please provide input in Words from Argument");
            return;
        }
        String[] words = Arrays.copyOfRange(args,0,args.length-1);

        System.out.println("Using HashMap:");

//        FrequencyChecker frequencyChecker= new FrequencyChecker();
            new FrequencyChecker().checkFrequency(words);

        System.out.println("Using TreeMap:");
            new FrequencyChecker().checkFrequency(words);
    }
}
