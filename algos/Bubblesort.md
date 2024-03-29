# Buble sort 
comparison sort method
 
<img src ='https://github.com/kunalpaliwal13/leetcode/assets/143526414/09433552-6d54-4f3f-b3ec-a6f83d891c8a' height = 290>

At every step the largest element from each iteration comes to the end of the unsorted part of the array 

Space complexity - O(1)<br> Time complexity- O(N^2)<br>
It is a stable sorting algorithm <br>
<img src ='https://github.com/kunalpaliwal13/leetcode/assets/143526414/322b7cb3-912d-4d1c-a635-27ed99678d22' height = 290>

```
public class BubbleSort {
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
```

