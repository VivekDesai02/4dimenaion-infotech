#include<stdio.h>

int main(){
    int row=10;
    for(int i=row;i>=1;i--){
        if(i%2==1){
            for(int k =row;k>=i;k--){
                printf(" ");
            }
            for(int j=1;j<=i;j++){
                if(j%2==1){
                    printf(" 1");
                }
                else{
                    printf(" 0");
                }
            }
        printf("\n");
        }
    }

    return 0;
}