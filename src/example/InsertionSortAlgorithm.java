package example;
import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        //initialise an Array of 10 int elements
        int[] myIntArray = {3, 7, 9, 1, 2, 5, 8, 4, 10};
        populateArray(myIntArray); // it populates the Array, although it is not sorted yet
        insertionSort(myIntArray); // Here is where the insertion sort algorithm is applied the non sorted Array
        printArray(myIntArray); // It prints the sorted Array
    }

    private static void insertionSort(int[] arrayElements) {
        int i;    //outer loop starting from [1], that is the second element, to the end of the list.
        //we assume that all elements to the left of the first element of the list [0] are smaller than element [0]
        int j; //our inner loop
        int key; //our current element to compare
        int temp; // temp value for swapping elements in the list

        for (i = 1; i < arrayElements.length; i++) //It starts at [1] because element [0] is already sorted
        {
            key = arrayElements[i]; // the current element starts with [1]
            j = i - 1; // element of [i] left for comparison with the current element key
            while (j >= 0 && key < arrayElements[j]) //it evaluates if j is less or equal to zero and if there are elements left to be compare with the key
            {
                temp = arrayElements[j];
                arrayElements[j] = arrayElements[j + 1];
                arrayElements[j + 1] = temp;
                j--;
            }
        }
    }

    public static void populateArray(int[] populatedArray) {
        for (int i = 0; i < populatedArray.length; i++) {
            populatedArray[i] = (int) (Math.random() * 100);
        }
    }

    public static void printArray(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) ;
        {
            System.out.println(Arrays.toString(sortedArray));
        }
    }
}
