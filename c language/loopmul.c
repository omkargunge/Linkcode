#include<stdio.h>

int main() {
    int i,n;

    printf("enter eny number");
    scanf("%d",&n);
    
    printf("\n\t-----------------------------------------------");
    printf("\n\tNUM\t*\ti\t=\tn*i");
     printf("\n\t----------------------------------------------");
    i=1;
    
    while (i <= 10) {
        
        printf("\n\t%d\t*\t%d\t=\t %d",n,i,n*i);
        i++;
    }
    printf("\n\t------------------------------------------------");
}



