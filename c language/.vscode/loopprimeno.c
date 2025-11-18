#include<stdio.h>

int main() {
    int n,i;
    int x=1;
    

    //boolean true 1and false 0
    printf("enter any number");
    scanf("%d",&n);//no=11


    i=2;
    
    while (i<n) {
        if(n%i==0){
            x=0;
            break;//stop loop come outside loop
        }
        i++;//i=1

    }//end loop
    if(x==1){
        printf("its prime number");
    }
    else{
        printf("not prime number");
    }

    return 0;
}
