#include<stdio.h>
int main(){

    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            printf(i%2==0 ?"0":"1" );
        }
        printf("\n");
    }
}