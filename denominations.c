#include <stdio.h>

int main()
{
    int A;
    printf("Enter the amount: ");
    scanf("%d", &A);

    int notes_2000 = A / 2000;
    int notes_500 = (A % 2000) / 500;
    int notes_200 = ((A % 2000) % 500) / 200;
    int notes_50 = (((A % 2000) % 500) % 200) / 50;
    int notes_20 = ((((A % 2000) % 500) % 200) % 50) / 20;
    int notes_5 = (((((A % 2000) % 500) % 200) % 50) % 20) / 5;
    int notes_2 = ((((((A % 2000) % 500) % 200) % 50) % 20) % 5) / 2;
    int notes_1 = (((((((A % 2000) % 500) % 200) % 50) % 20) % 5) % 2) / 1;
    if(A>0)
        printf("2000: %d 500: %d 200: %d 50: %d 20: %d 5: %d 2: %d 1: %d\n", 
           notes_2000, notes_500, notes_200, notes_50, notes_20, notes_5, notes_2, notes_1);
    else
        printf("NA");
    return 0;
}
