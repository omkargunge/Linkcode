#include<stdio.h>
int main(){
    

    char name[20];
    printf("enter your name :");
    scanf("%s",name);
    

    int len;

    for(len=0;name[len]!='\0';len++);

    for(int i=0;i<len;i++){
        if(name[i]=='a'||name[i]=='e'||name[i]=='i'||name[i]=='o'||name[i]=='u'||
        name[i]=='A'||name[i]=='E'||name[i]=='I'||name[i]=='O'||name[i]=='U'){
        printf("%c ",name[i]);
        }
    }
}