package Day2;

class ArrayPopulation {
    public static int[] populateArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] resultantArray = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            resultantArray[2 * i + 1] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            resultantArray[2 * i] = arr2[i];
        }
        return resultantArray;
    }

    public static void print(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
