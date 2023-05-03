// #include<stdio.h>

// int main(){

//     // for(int i=0;1;i++){
//     // printf("%d\n",i);
//     // }

//     int x=10, y=20,z;
//     // for(z = 0;z<x;){
//     //     z = z++ +y;
//     //     printf("%d\n",z);
//     // }
//     for(z = 0;z<y;z++){
//         if(z==x){
//             printf("%d\n",z);
//         }
//         else{
//             break;
//         }
//     }
//     return 0;

// }

/**
 * C program to print ASCII values of all characters.
 */

#include <stdio.h>

int main()
{
    int i;

    /* Print ASCII values from 0 to 255 */
    for(i=0; i<=255; i++) 
    {
        printf("ASCII value of character %c = %d\n", i, i);
    }

    return 0;
}