#include<stdio.h>

int main(){

    int ch;
    printf("enter any numbar between 1 to 7");
    scanf("%d",&ch);
    switch (ch)
    {
    case 1:
        printf("monday");
    break;
    
    case 2:
        printf("tus");
    break;
    
    case 3:
        printf("wed");
    break;
    
    default:
        printf("inavlid day");
        
    }
}