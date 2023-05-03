#include<stdio.h>

int main(){
    int i,n,sum=0;
    printf("Enter 10 number:\n");
    for(i = 1;i<=10;i++){
        printf("%d  ",i);

        scanf("%d",&n);
        sum +=n;
    }
    printf("sum%d",sum);

    float avg;
    avg = sum/10;

    printf("\navg %f",avg);
    
}