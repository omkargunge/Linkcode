#include<stdio.h>

int main(){
    int num1,num2;
    num1=10;
    num2=20;

    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;

    printf("\nafter swaping num1 is %d and num2 is %d",num1,num2);
}