//prog to search an element in a list using ptrs

#include<stdio.h>

int main(){
    int arr[] = {10,20,30,12,13,4,5,7,8,82}, searchElement;
    int size = sizeof(arr)/sizeof(arr[0]);
    printf("%d", *(arr+2));
    return 0;
}
