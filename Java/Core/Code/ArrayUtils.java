import java.util.*;

public class ArrayUtils {

    // Find the maximum element in the array
    public static int findMax(int[] arr) {
        return Arrays.stream(arr).max().orElse(Integer.MIN_VALUE);
    }

    // Find the minimum element in the array
    public static int findMin(int[] arr) {
        return Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
    }

    // Print all even numbers in the array
    public static List<Integer> getEvenNumbers(int[] arr) {
        List<Integer> evens = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) evens.add(num);
        }
        return evens;
    }

    // Generate Fibonacci series of given length
    public static int[] generateFibonacci(int len) {
        if (len <= 0) return new int[0];
        int[] fib = new int[len];
        fib[0] = 0;
        if (len > 1) fib[1] = 1;
        for (int i = 2; i < len; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    // Reverse the array in place
    public static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Perform linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    // Perform binary search (assumes array is sorted)
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] > key) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    // Sort the array using Bubble Sort
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Find missing element from 1 to n (assuming 1 missing number)
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(arr).sum();
        return expectedSum - actualSum;
    }

    // Find the single (non-duplicate) element in array where all others appear twice
    public static int findSingleElement(int[] arr) {
        int res = 0;
        for (int num : arr) res ^= num;
        return res;
    }
}
