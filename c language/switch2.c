#include<stdio.h>

int main(){

    int ch,ct;
    float radius,base,height,carea,tarea,length,width,react;

    menu:

    printf("\n1area of circle\n2area of triangle\n3area of react");
    printf("\nenter your choice");
    scanf("%d",&ch);

    switch (ch)
    {
    case 1:
        printf("\nenter radius of circle");
        scanf("%f",&radius);
        carea=3.14*radius*radius;
        printf("\narea of circle is : %f",carea);
    break;

     case 2:
        printf("\nenter base and height");
        scanf("%f%f",&base,&height);
        tarea=0.5*base*height;
        printf("\narea of triangle is : %f",tarea);
    break;

     case 3:
        printf("\nenter length and width");
        scanf("%f%f",&length,&width);
        react=length*width;
        printf("\narea of rectangle is : %f",react);
    break;
    
    default:
        break;
    }

    printf("\ndo you want to continue press 1");
    scanf("%d",&ct);
    if(ct==1){
        goto menu;
    }
}