#include<stdio.h>
int main(){
    
    for(int i=1;i<=11;i++){
        for(int j=1;j<=11;j++){
            if((i==1) || (i==11)||(j==1)||(j==11)||(i==11/2+1)||((j==11/2+1))||(i==j)||(i+j==12)){
            printf("*");
            }
            else{
                 printf(" ");
            }
        }
        printf("\n");
    }
    
}