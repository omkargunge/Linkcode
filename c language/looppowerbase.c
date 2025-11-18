#include<stdio.h>

int main() {
    int base,power,result;
    int i;
    
    printf("enter base and power");
    scanf("%d%d",&base,&power);//base=2 power=3
    result=1;
    i=1;

    while (i <= power) {
        result=result*base;//result=1*2=2*2=4*2=8
        i++;//i=4
    }
    printf("\nfor base %d power %d result %d",base,power,result);
    return 0;
}
