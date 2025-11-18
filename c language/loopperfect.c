#include<stdio.h>

int main() {
    int no;
    int sum=0,i;

    printf("enter any number");
    scanf("%d",&no);//no=28


    i=1;
    
    while (i <= no/2) {

        if(no%i==0){
            sum=sum+i;//sum=0+1=1+2=3+4=7+7=14+14=28
        }
        
        i++;//i=14
    }

    if (sum==no)
    {
        printf("its perfect number");
    }
    else{
        printf("not perfect number");
    }
    
    

    return 0;
}
