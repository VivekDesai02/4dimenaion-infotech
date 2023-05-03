#include<stdio.h>

int main(){
    int row=10;
    for(int i=1;i<=row;i++){
        if(i%2==1){
            for(int k=row;k>i;k--){
                printf(" ");
            }
            for(int j=1;j<=i;j++){
                printf("* ");
            }
        
        printf("\n");
        }
    }
    for(int i=row;i>0;i--){
        if(i%2==1){
            for(int j=row;j>=i;j--){
                printf(" ");
            }
            for(int k=2;k<i;k++){
                printf(" *");
            }
        printf("\n");
        }
    }
    
    return 0;
}
