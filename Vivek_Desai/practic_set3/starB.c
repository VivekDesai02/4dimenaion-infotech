#include<stdio.h>

int main(){
    int row=5;
    for(int i=row;i>0;i--){
        for(int j=1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
}