#include<stdio.h>

int main(){
    int factorial=1,num;
    printf("Enter a number");
    scanf("%d",&num);

    for(int i=1;i<=num;i++){
        factorial = factorial*i;
        printf("%d *",i);
    }
    printf("Factorial of Number %d is %d",num,factorial);
}