#include<stdio.h>
 
int main(){
    int x, *ptr;
    ptr = &x;
    x=100;
    *++ptr++=200;
    printf("%d %d", x, *ptr);
    return 0;
    
}
