#include<stdio.h>
void welcome()__attribute__ ((constructor));
void thank() __attribute__ ((destructor));
void welcome () {
	printf("Good afternoon to everyone\n");
}
void thank() {
	printf("\n Thank you so much for being very very silent");
}
int main() {
	printf("This is main()\n");
	return 0;
}
