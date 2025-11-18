#include<stdio.h>
int main (){
     
    int no;
    int rev,r,temp;
    int sum=0;

    printf("enter eny number");
    scanf("%d",&no);//no=121
    temp=no;//121
    rev=0;

    while (no!=0)
    {
        r=no%10;//r=121%10=1   | r=12%10=2  |r=1%10=1
        sum=sum+r;//0+1+2+1=4
        rev=rev*10+r;//rev=0*10+1=1 | rev=1*10+2=12  | rev=12*10+1+121

        no=no/10;//no=121/10=12  | no=12/10=1  | no=1/10=0
    }
    printf("\nreverse of the given no is: %d",rev);
    printf("\nsum of digit of given number is : %d",sum);

    if (temp==rev)
    {
        printf("\n%d is palindrome number");
    }
    else{
        printf("\nnot palindrome");
    }
    
    
}