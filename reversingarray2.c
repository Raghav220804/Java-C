#include<stdio.h>
int main(){
    /*int arr[] = {4,6,7,7,8987,5,6,89,8643};
    //finding length of array
    int size = sizeof(arr)/sizeof(arr[0]);*/
    int size;
    scanf("%d",&size);
    int arr[size];
    //getting array elements
    for(int i=0;i<size;i++)
        scanf("%d",&arr[i]);
    //reversing
    for(int i=0, j=size-1;i<j;i++,j--)
        arr[i] = arr[i]+arr[j] - (arr[j]=arr[i]);
    //printing array elemts
    for(int i=0;i<size;i++)
        printf("%d ",arr[i]);
}
