package Day7.Assignment3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayShuffling {

    public static void main(String[] args) {

        String[] array = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};

        ArrayShuffling arrayShuffling = new ArrayShuffling();
        arrayShuffling.shuffleArray(array);
        System.out.println("Shuffled Array:");

        for (String element : array) {
            System.out.println(element);
        }
    }

    public void shuffleArray(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);
    }
}
