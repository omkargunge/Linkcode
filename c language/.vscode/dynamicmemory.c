#include<stdio.h>
#include<stdlib.h>

int main(){
    int *ptr;
    int n;
    printf("enter th size of memory:");
    scanf("%d",&n);

    ptr=(int*)malloc(n*sizeof(int));//10*4=20
    if(ptr==NULL){
        printf("malloc faild");
        return 1;

    }
    for(int i=0;i<n;i++){
        ptr[i]=i+1;
        printf("%d ",ptr[i]);

    }

    return 0;
}