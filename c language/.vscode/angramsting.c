#include<stdio.h>
void sort(char str[],int len){
    for(int i=0;i<len;i++){
        for(int j=0;j<len-1;j++){
            if(str[j]>str[j+1]){
                char temp=str[j];
                str[j]=str[j+1];
                str[j+1]=temp;
            }
        }
    }
}

int main (){

    char str1[]="anita";
    char str2[]="tania";
    int len;

    for(len=0;str1[len]!='\0';len++);
    printf("before sorting :%s\n",str1);
    printf("before sorting :%s\n",str2);
    sort(str1,len);
    sort(str2,len);
    printf("after sorting :%s\n",str1);
    printf("after sorting :%s\n",str2);
    return 0;
}