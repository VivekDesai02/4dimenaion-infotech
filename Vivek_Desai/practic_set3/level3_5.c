#include<stdio.h>

int main(){
    int num,isprime;
    printf("enetr the number:");
    scanf("%d",&num);

   
    printf("your number: %d\n",num);
    for(int i=2;i<=num;i++){
        if(num%i==0){
           int temp = i;
           isprime=1;
           for(int i=2;i<=temp/2;i++){
                if(temp%i==0){
                    isprime=0;   
                }
                }
        if(isprime==1){
             printf("number of prime factor: %d\n",temp);
           }
        }
    }
    return 0;
}