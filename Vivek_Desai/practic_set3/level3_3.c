#include<stdio.h>

int main(){
    int num ;
    for(int i=1;i<=100;i++){
        num = i;
        int isprime = 1;

        for(int i = 2;i<=num/2;i++){
            if(num%i==0){
                isprime = 0;
            }
        }
        if(isprime==1){
            printf("%d\n",num);
        }
    }
    return 0;
    
}