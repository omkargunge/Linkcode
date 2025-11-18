#include<stdio.h>

int main() {

    char name[20];
    printf("enter your name:");
    scanf("%s",name);

    int len;

    for(len=0;name[len]!='\0';len++);

    
    for(int i=0;i<len;i++){
        printf("%c ",name[i]);
    }
        
    printf("\nlength of givn string:%d",len);
}