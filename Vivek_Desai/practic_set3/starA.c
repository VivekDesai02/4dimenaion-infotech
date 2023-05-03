#include<stdio.h>

int main(){
    int row=5;
    for(int i=0;i<row;i++){
        // printf("%d",i);
        for(int j=0;j<i;j++){
            printf(" ");
        }
        for(int k=i;k<row;k++){
            printf("*");
        }
        printf("\n");
    }
}