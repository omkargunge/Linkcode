#include<stdio.h>

int main() {
    int n,i,result;
    result=1;

    printf("enter any number");
    scanf("%d",&n);//no=5


    i=1;
    
    while (i <= n) {

        result=result*i;//result=1*i=1*2=2*3=6*4=24*5=120
        
        
        i++;//i=6
    }
    printf("\nfactorial of %d is %d",n,result);

    return 0;
}
