#include <stdio.h>
#include <stdlib.h>

int main() {
    int n, *arr;
    scanf("%d", &n); // Input the size of the array

    // Allocate memory for the array
    arr = (int*)calloc(n, sizeof(int));
    if (arr == NULL) {
        printf("Memory allocation failed.\n");
        return 1;
    }

    // Input the elements of the array
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Display unique elements
    for (int i = 0; i < n; i++) {
        int found = 0;
        // Check all previous elements for duplicates
        for (int j = 0; j < i; j++) {
            if (arr[i] == arr[j]) {
                found = 1; // Duplicate found
                break;
            }
        }
        if (!found) {
            printf("%d ", arr[i]); // Print unique element
        }
    }

    // Free allocated memory
    free(arr);

    return 0;
}
