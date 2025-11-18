#include<stdio.h>
 int main(){

    int i;
    int sum=0;

    for(i=2;i<=20;i=i+2){
        printf("\n%d",i);
        sum=sum+i;
    }
printf("\nsum of first ten even number is : %d",sum);
 }