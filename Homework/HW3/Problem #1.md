@author - Sarthak Sethi 

void insertionSort(int arr[]) {
    int n = arr.length; // get array size (O(1)).
    for (int i = 1; i < n; ++i) { // iterate over array (O(n) but leads to O(n^2) in worst case).
        int key = arr[i]; //current element to sort (O(1)).
        int j = i - 1; //start comparison one element back (O(1)).

        //find correct position for key by comparing backwards (worst-case O(n) per element).
        while (j >= 0 && arr[j] > key) { //move elements greater than key to right (O(n) worst-case per insertion).
            arr[j + 1] = arr[j]; //shift operation (O(1), but contributes to O(n^2) overall).
            j = j - 1; //move back in the sorted section (O(1)).
        }
        arr[j + 1] = key; // Place key in correct position (O(1)).
    }
    //overall: O(n) best xsxsase, O(n^2) average and worst case due to nested loops.
}



