package Day4.Assignment5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyChecker {

    public void checkFrequency(String[] words,String additionalWord) {
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        frequencyMap.put(additionalWord, frequencyMap.getOrDefault(additionalWord, 0) + 1);
        TreeMap<String, Integer> sortedMap = new TreeMap<>(frequencyMap);

        System.out.print("{");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + ",");
        }
        System.out.println("}");
    }

        public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Please provide input in Words from Argument");
            return;
        }
        String[] words = Arrays.copyOfRange(args,0,args.length-1);
        String additionalWord = args[args.length-1];

        System.out.println("Using HashMap:");

        FrequencyChecker frequencyChecker= new FrequencyChecker();
        frequencyChecker.checkFrequency(words, additionalWord);

        System.out.println("Using TreeMap:");
        frequencyChecker.checkFrequency(words,additionalWord);
    }
}
