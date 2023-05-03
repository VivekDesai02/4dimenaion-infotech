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
    for(int i=1;i<row;i++){
        for(int j=(row-1)-i;j>0;j--){
            printf(" ");
        }
        for(int k=0;k<=i;k++){
            printf("*");
        }

        printf("\n");
    }
}