#include<stdio.h>

int main(){

    int array[5]={1,2,3,4,5};
    int len=sizeof(array)/sizeof(array[0]);
    printf("enter a key");

    int key;
    scanf("%d",&key);
    int left=0,right=len-1,mid,flag=0;
    while(left<=right){
        mid=(left+right)/2;
        if(array[mid]==key){
            flag=1;
            break;
        }else if(array[mid]<key){
            left=mid+1;

        }else if (array[mid]>key){
            right=mid-1;
        }
    }
    printf((flag==1)?"key is found":"key noy found");



}