#include<stdio.h>

int main(){

    int num1,num2,add,sub,mul;
    float div;

    printf("enter any two numbers");
    scanf("%d%d",&num1,&num2);

    add=num1+num2;
    sub=num1-num2;
    mul=num1*num2;
    div=num1/(float)num2;

    printf("\naddition %d and %d is : %d",num1,num2,add);
    printf("\nsubstration %d and %d is : %d",num1,num2,sub);
    printf("\nmultiplication %d and %d is : %d",num1,num2,mul);
    printf("\ndivison %d and %d is : %.2f",num1,num2,div);
}