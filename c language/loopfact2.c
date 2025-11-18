#include<stdio.h>

int main() {
    int i,no;

    printf("enter any number");
    scanf("%d",&no);//no=10


    i=1;
    
    while (i <= no/2) {//6<=5

        if(no%i==0){//10%5==2
            printf("\n%d",i);//i=1 2 5 
        }
        
        i++;//i=2 3 4 5 6
    }
    printf("\n---------THANK YOU----------");

    return 0;
}
