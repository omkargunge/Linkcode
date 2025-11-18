#include<stdio.h>

int main (){
    float base,height,area;

    printf("enter the base and height");
    scanf("%f%f",&base,&height);

    area=0.5*base*height;

    printf("\narea of triangle is : %0.2f",area);
}