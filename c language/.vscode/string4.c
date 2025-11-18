#include<stdio.h>

void reverse(char str[],int len){
    //hellow

int start=0,end=len-1;
while(start<=end){
    char temp=str[start];//h
    str[start++]=str[end];//0
    str[end--]=temp;//h
}
}
int palindrome(char str[],int len){

    int start=0,end=len-1;
    while(start<=end){
        if(str[start]!=str[end]){
            return 0;
        }
        start++;
        end--;
    }
    return 1;
}

int main(){
    //reverse a string
    char str[]="hellow"; //hellow
    int len;
    for(len=0;str[len]!='\0';len++);

    printf("before reverse : %s\n",str);
    reverse(str,len);
    int result=palindrome(str,len);
    printf(result?"it is pallindrome string":"not palindrome string");
    printf("\nAfter reverse : %s",str);
    return 0;
}  