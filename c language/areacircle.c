#include<stdio.h>
int main(){

    float radius,area;

    printf("enter the radius of circle");
    scanf("%f",&radius);

    area=3.14*radius*radius;

    printf("\narea of circle is : %0.2f",area);
}