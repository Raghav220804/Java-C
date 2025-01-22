#include <stdio.h>

int main()
{
    int A;
    printf("Enter the amount: ");
    scanf("%d", &A);
    
    printf("Available Denominations: 500, 200, 100, 50\n");
    
    int notes_500 = A/500;
    int notes_200 = (A%500)/200;
    int notes_100 = ((A%500)%200)/100;
    int notes_50 = (((A%500)%200)%100)/50;
    int remaining_change = (((A%500)%200)%100)%50;
    if(A>0)
        printf("500: %d 200: %d 100: %d 50: %d\nRemaining Change: %d\n", 
           notes_500, notes_200, notes_100, notes_50, remaining_change);
    else
        printf("NA");
    return 0;
}
