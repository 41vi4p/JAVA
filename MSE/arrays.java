// 41. Find the largest element in an array
int findLargest(int[] arr) {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

// 42. Reverse an array
void reverseArray(int[] arr) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

// 43. Find the sum of all elements in an array
int sumArray(int[] arr) {
    int sum = 0;
    for (int num : arr) {
        sum += num;
    }
    return sum;
}

// 44. Bubble sort
void bubbleSort(int[] arr) {
    boolean swapped;
    for (int i = 0; i < arr.length - 1; i++) {
        swapped = false;
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // swap arr[j] and arr[j + 1]
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) break; // If no two elements were swapped by inner loop, then break
    }
}

// 45. Find the second largest element in an array
int findSecondLargest(int[] arr) {
    int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
    for (int num : arr) {
        if (num > first) {
            second = first;
            first = num;
        } else if (num > second && num != first) {
            second = num;
        }
    }
    return second;
}

// 46. Merge two arrays
int[] mergeArrays(int[] arr1, int[] arr2) {
    int[] merged = new int[arr1.length + arr2.length];
    System.arraycopy(arr1, 0, merged, 0, arr1.length);
    System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
    return merged;
}

// 47. Remove duplicates from an array
int[] removeDuplicates(int[] arr) {
    return Arrays.stream(arr).distinct().toArray();
}

// 48. Find the frequency of each element in an array
void findFrequency(int[] arr) {
    HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    for (int num : arr) {
        frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }
    for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
        System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
    }
}

// 49. Rotate an array to the left by a given number of positions
void rotateLeft(int[] arr, int positions) {
    int n = arr.length;
    int[] temp = new int[n];
    for (int i = 0; i < n; i++) {
        temp[(i + n - positions) % n] = arr[i];
    }
    System.arraycopy(temp, 0, arr, 0, n);
}

// 50. Check if an array is a palindrome
boolean isArrayPalindrome(int[] arr) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
        if (arr[start] != arr[end]) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}