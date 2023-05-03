#include<stdio.h>

int main(){
    int num1,num2,grater=0;

    printf("Enetr 1st number:");
    scanf("%d",&num1);
    printf("Enetr 2nd number:");
    scanf("%d",&num2);

    if(num1<num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    for(int i=2;i<=num1/2;i++){
        if(num1%i==0 && num2%i==0){
            // printf("%d\n",i);
           if(i>grater){
                grater=i;
               
           }

        }

    }
    printf("%d\n",grater);
    return 0;
}