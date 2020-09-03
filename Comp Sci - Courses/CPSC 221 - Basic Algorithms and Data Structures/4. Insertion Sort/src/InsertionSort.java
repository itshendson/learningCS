import java.util.ArrayList;

public class InsertionSort {

    /**
     * My attempt at creating an insertion sort algo.
     * The problem with my algo is that it is O(n^3) due to the loops.
     * I also created an ArrayList for sorted Array. This creates ANOTHER object in memory which is a waste of capacity.
     * Could not get it my first try. I have a working solution...just couldn't compare reach the last index.
     */
    public static ArrayList<Integer> insertionSort(int[] unsortedArray) {
        ArrayList<Integer> sortedArray = new ArrayList<Integer>();

        sortedArray.add(unsortedArray[0]);

        for (int keyIndex = 1; keyIndex < unsortedArray.length; keyIndex++) {
            int keyValue = unsortedArray[keyIndex];
            int index = sortedArray.size();

            while (index > 0) {

                if (keyValue > sortedArray.get(index - 1)) {
                    sortedArray.add(index, keyValue);
                    break;
                } else {
                    index--;
                }
            }
        } return sortedArray;
    }

    /**
     * The textbook solution was so simple:
     */
    public static int[] solution(int[] list) {
        int i, j, keyValue, temp;

        for (i = 1; i < list.length; i++) {
            keyValue = list[i];
            j = i - 1;

            while (j >= 0 && keyValue < list[j]) {
               temp = list[j];
               list[j] = list[j + 1];
               list[j + 1] = temp;
               j--;
               }
            } return list;
        }
}

