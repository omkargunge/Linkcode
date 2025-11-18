#include<stdio.h>
#include<stdlib.h>

int main(){
    int n,i;
    int *ptr;
    int min;
    printf("enter the number of element:");
    scanf("%d",&n);

    ptr=(int*)calloc(n,sizeof(int));
    if(ptr==NULL){
        printf("calloc failed....");
        return 1;
    }
    printf("enter the value of array:");
    for(i=0;i<n;i++){
        scanf("%d",&ptr[i]);
    }
    
    min=ptr[0];
    for(int i=0;i<n;i++){
        if(ptr[i]<min){
            min=ptr[i];
        }
    }
    printf("min value is :%d",min);
    return 0;

}