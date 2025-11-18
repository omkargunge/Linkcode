#include<stdio.h>

void reverse(char str[],int start,int end){
    while(start<=end){
    char temp=str[start];//h
    str[start++]=str[end];//0
    str[end--]=temp;//h
}
}

void reverseword(char str[],int len){
    //hellow

int start=0,end;
for(int i=0;i<=len;i++){
    if(str[i]==' '||str[i]=='\0'){
        end=i-1;
        reverse(str,start,end);
        start=i+1;

    }
}

}

int main(){
    //reverse a string
    char str[]="hellow java program"; //hellow
    int len;
    for(len=0;str[len]!='\0';len++);

    printf("before reverse : %s\n",str);
    reverseword(str,len);
    
    printf("\nAfter reverse : %s",str);
    return 0;
}  