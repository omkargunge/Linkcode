#include<stdio.h>
int main(){
    
    for(int i=1;i<=10;i++){
        for(int j=9;j>=i;j--){
            printf(" ");
        }
        for(int j=1;j<=i;j++){
            printf("*");
        }
        printf("\n");
    }
}