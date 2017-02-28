package main.sort;

public class MergeSort {
	private int[] array;
	private int[] temp;
	private int length;

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.temp = new int[length];
		doMergeSort(0, length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	/**
	 * Compares and orders the two sections left and right, which are already
	 * ordered. writes the ordered section onto the arr in the section it is
	 * operated in.
	 * 
	 * @param lowerIndex
	 * @param middle
	 * @param higherIndex
	 */
	private void mergeParts(int lowerIndex, int middle, int higherIndex) {
		// copy part of the array
		for (int i = lowerIndex; i <= higherIndex; i++) {
			temp[i] = array[i];
		}
		// index of the smallest in left section
		int cLeft = lowerIndex;
		// index of the smallest in right section
		int cRight = middle + 1;
		// index to arr to write smallest found
		int i = lowerIndex;

		while (cLeft <= middle && cRight <= higherIndex) {
			// compare smallest left to smallest right
			if (temp[cLeft] <= temp[cRight]) {
				array[i] = temp[cLeft];
				cLeft++;
			} else {
				array[i] = temp[cRight];
				cRight++;
			}
			i++;
		}
		// checks if there are any unsorted indexes
		while (cLeft <= middle) {
			array[i] = temp[cLeft];
			i++;
			cLeft++;
		}

	}
	/**
	 * alternative
	 * @param arr
	 * @param low
	 * @param high
	 */
	public static void sort(int[] arr, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        sort(arr, low, mid); 
        sort(arr, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = arr[j++];
            else if (j == high) 
                temp[k] = arr[i++];
            else if (arr[j]<arr[i]) 
                temp[k] = arr[j++];
            else 
                temp[k] = arr[i++];
        }    
        for (int k = 0; k < N; k++) 
            arr[low + k] = temp[k];         
    }
}
