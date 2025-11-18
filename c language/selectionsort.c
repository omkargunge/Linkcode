#include<stdio.h>
int main(){
    int arr[5]={4,3,1,2,5};
    int len=sizeof(arr)/sizeof(arr[0]);// 20/4=5
    
    int min;
    

    for(int i=0;i<len-1;i++){
        min=i;
        //1 2 3 4 5
        for(int j=i+1;j<len;j++){ 
            if(arr[min]>arr[j]){//2>5
            min=j;//3
            }
        }
        int temp=arr[i];//3
        arr[i]=arr[min];//1
        arr[min]=temp;
    }
    printf("After : ");
    for(int i=0;i<len;i++){
        printf("%d ",arr[i]);
    }

    printf("\n");
}