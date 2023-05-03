#include<stdio.h>

int main(){

    int num,rsv=0,x;
    printf("Enetr the number:");
    scanf("%d",&num);

    while(num>0){
        x = num%10;
        rsv = rsv*10+x;
        num /=10;
    }
    printf("reverse number is: %d",rsv);

    return 0;
}