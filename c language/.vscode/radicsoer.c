#include <stdio.h>

void display(int arr[], int len) {
    for (int i = 0; i < len; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int getMax(int arr[], int len) {
    int max = arr[0];
    for (int i = 1; i < len; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

void countingsort(int arr[], int len, int exp) {
    int output[len];         // Output array
    int count[10] = {0};     // Count array for digits (0 to 9)

    // Store count of occurrences
    for (int i = 0; i < len; i++) {
        int digit = (arr[i] / exp) % 10;
        count[digit]++;
    }

    // Change count[i] so that count[i] contains the actual position
    for (int i = 1; i < 10; i++) {
        count[i] += count[i - 1];
    }

    // Build the output array (loop goes from len-1 to 0)
    for (int i = len - 1; i >= 0; i--) {
        int digit = (arr[i] / exp) % 10;
        output[--count[digit]] = arr[i];
    }

    // Copy output[] to arr[]
    for (int i = 0; i < len; i++) {
        arr[i] = output[i];
    }
}

void radixsort(int arr[], int len) {
    int maxele = getMax(arr, len);
    for (int exp = 1; maxele / exp > 0; exp *= 10) {
        countingsort(arr, len, exp);
    }
}

int main() {
    int arr[] = {12, 456, 89, 112, 78, 66, 9};
    int len = sizeof(arr) / sizeof(arr[0]);

    printf("Before sorting: ");
    display(arr, len);

    radixsort(arr, len);

    printf("After sorting: ");
    display(arr, len);

    return 0;
}
