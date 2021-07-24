public class BinarySearch {
    // Returns index of x if it is present in arr[l..r], else
    // return -1
    // Returns index of x if it is present in arr[], else
    // return -1
    int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        int comparisons = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x) {
                comparisons++;
                return comparisons;
            }
            // If x greater, ignore left half
            if (arr[m] < x) {
                comparisons++;
                l = m + 1;
            }
                // If x is smaller, ignore right half
            else {
                comparisons++;
                r = m - 1;
            }
        }

        // if we reach here, then element was not present
        return comparisons;
    }

    public static void main (String[]args){
            BinarySearch ob = new BinarySearch();
            int arr[] = {3, 14, 27, 31, 39, 42, 55, 70, 74, 81, 85, 93, 98};
            int n = arr.length;
            int x = 105;
            int result = ob.binarySearch(arr, x);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("# of comparisons " + result);
        }
    }

