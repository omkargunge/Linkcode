#include<stdio.h>
int main(){

    int i,no;

    printf("enter any value");
    scanf("%d",&no);

    printf("\nfactor of %d is :\n",no);
    for(i=2;i<=no/2;i++){
        
        if(no%i==0){
            printf("\n%d",i);
        }
    }
}