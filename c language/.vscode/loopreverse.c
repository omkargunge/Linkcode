#include<stdio.h>

int main(){

    int no;
    int i,rev,r;
    int temp;

    printf("enter eny number");
    scanf("%d",&no);//no=123

    temp=no;//temp=123

    rev=0;
    while (no!=0){//123!=0  123%10=3  | 12!=0   |  1!=0
    
        r=no%10;  //r=123%10=  3| r=12%10=2   | r=1%10=1
        rev=(rev*10)+r; //rev=(0*10)+3=  3 | rev=(3*10)+2=32 | rev=(32*10)+1=321
        no=no/10;  //no=123/10=12  | no=12/10=1  | no=1/10=0
    }
    printf("\nreverse of %d is %d",temp,rev);
    

}
