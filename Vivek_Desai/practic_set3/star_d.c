#include<stdio.h>

int main(){
//     for(int i=5;i>0;i--){
//         for(int j=1;j<=5;j++){
//             if(j>i){
//                 printf(" ");
//             }
//             else{
//                 printf("*");
//             }
//         }
//         for(int j=5;j>=1;j--){
//              if(j>i){
//                 printf(" ");
//             }
//             else{
//                 printf("*");
//             }
//         }
//         printf("\n");
        
//     }
// }
    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            if(j<=i){
                printf("%d",j);
            }
            else{
                printf(" ");
            }
        }
        for(int j=5;j>=1;j--){
             if(j<=i){
                printf("%d",j);
            }
            else{
                printf(" ");
            }
        }
        printf("\n");
    
    }
    for(int i=5-1;i>0;i--){
        for(int j=1;j<=5;j++){
            if(j>i){
                printf(" ");
            }
            else{
                printf("%d",j);
            }
        }
        for(int j=5;j>=1;j--){
             if(j>i){
                printf(" ");
            }
            else{
                printf("%d",j);
            }
        }
        printf("\n");
        
    }
    return 0;
}