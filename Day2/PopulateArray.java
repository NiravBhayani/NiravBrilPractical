package Day2;

public class PopulateArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1};
        int[] arr2 = {2, 2, 2, 2, 2};

        int[] resultantArray = ArrayPopulation.populateArray(arr1,arr2);

        ArrayPopulation.print(resultantArray);
    }
}
