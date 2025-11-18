#include<stdio.h>

int main(){

    int arr[6]={0,1,1,0,1,1};


    int len=sizeof(arr)/sizeof(arr[0]);
    int count0=0,count1=0;

    for(int i=0;i<len;i++){
        if(arr[i]==0){
            count0++;
        }
        else if(arr[i]==1){
            count1++;
        }
    }
    for(int i=0;i<count0;i++){
        arr[i]=0;
    }
     for(int j=count0;j<len;j++){
        arr[j]=1;
    }
    for(int i=0;i<len;i++){
        printf("%d",arr[i]);
    }

}