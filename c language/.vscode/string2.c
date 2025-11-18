#include<stdio.h>
int main(){
    int i;

    char name[5]="omkar";

    for(i=5; name[i]!=0;i--){
        printf("%c\n",name[i]);
    }
}