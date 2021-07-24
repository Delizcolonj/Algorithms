package lab7;

import java.util.Arrays;

public class QuickSelect {

    private static int quickSelect(int[] array, int left, int right, int key){
        int s = LomutoPartition(array, left, right);
        if (left <= right) {
            if (s == key + 1) {
                return array[s];
            } else if (s > left + key - 1) {
                quickSelect(array, left, s - 1, key);
            } else
                quickSelect(array, s + 1, right, key - s);

        }
        return array[s];
    }
    public static int LomutoPartition(int array[], int left, int right) {
        int pivot = array[left];
        int s = left;
        for( int i = left+1; i<=right; i++) {
            if(array[i] < pivot) {
                s = s+1;
                //swap
                int temp = array[s];
                array[s] = array[i];
                array[i] = temp;
            }
        }
        //swap(array, array[left], array[s]);
        int temp2 = array[left];
        array[left] = array[s];
        array[s] = temp2;
        return s;
    }
    private static void swap(int array[],int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static int findElement(int array[], int key) {
        for (int i = 0; i <= array.length; i++) {
            if (i == key) {
                return array[i];
            }
        }
        return array[key];
    }
    public static void main(String[] args) {
        int[] unsorted = new int[] {9, 12, 5, 17, 20, 30, 8} ;
        quickSelect(unsorted, 0, unsorted.length-1, 5);

        System.out.println(Arrays.toString(unsorted));//displays the list after k is found

        System.out.println("The kth smallest position in the array is: " + findElement(unsorted, 5));// displays the kth smallest element


    }
}
