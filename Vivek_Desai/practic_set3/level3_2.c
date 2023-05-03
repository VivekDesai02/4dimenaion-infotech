// #include<stdio.h>

// int main(){
//     int x,arm=0;
  
//     // printf("enetr the number:");
//     // scanf("%d",&num);
//     for(int i=100;i<=500;i++){
//         int temp=i;

//     while(i>0){
//         x=i%10;
//         arm=arm+(x*x*x);
//         i/=10;
//     }

//     if(temp==arm){
//         printf("%d\n",i);

//     }
//     // else{
//     //     printf("it is not armstrong number");

//     // }

//     }
//     return 0;
// }


#include<stdio.h>

int main(){
   for(int i=100;i<500;i++){
      int x,arm=0;
        int temp = i;
        
        while(temp>0){
            x = temp%10;
            arm = arm +(x*x*x);
            temp = temp/10;
        }
        
        if(i==arm){
            printf("%d\n",arm);
        }

    }

    return 0;

}