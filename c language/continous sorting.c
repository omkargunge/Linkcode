#include<stdio.h>
void display(int arr[],int len){
    for(int i=0;i<len;i++){
        printf("%d ",arr[i]);
    }
}




void countingsort(int arr[],int len){
    int count[10]={0};
    int temparr[len];

    for(int i=0;i<len;i++){
        count[arr[i]]++;
    }


    for(int i=1;i<10;i++){
        //0 2 5 7 7 9 0 0 0 0
        count[i]+=count[i-1];//count[i]=count[i]+count[i-1];
    }

    for(int i=0;i<len;i++){
        temparr[--count[arr[i]]]=arr[i];//temp[5]=arr[3]
    }

    for(int i=0;i<len;i++){
        arr[i]=temparr[i];
    }
}

int main(){
    int arr[]={2,3,1,2,5,3,2,5,1};
    int len=sizeof(arr)/sizeof(arr[0]);//9
    countingsort(arr,len);
    printf("\n");
    display(arr,len);
}