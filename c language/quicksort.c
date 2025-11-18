#include <stdio.h>
void swap(int *a,int *b){
    int temp=*a;
    *a=*b;
    *b=temp;
}
int partition(int arr[],int start,int end){

    int pivot=arr[end];//3
    int i=start-1;//-1

    for(int j=start;j<end;j++){//1 2 3 4 5
        if(arr[j]<pivot){
            i++;//0 1 2
            swap(&arr[i],&arr[j]);
        }
    }
    swap(&arr[++i],&arr[end]);
    return i;//2
}

void quicksort(int arr[],int start, int end){
    if(start<end){
        int pi=partition(arr,start,end);
        //2
        quicksort(arr,start,pi-1);
        quicksort(arr,pi+1,end);


    }
}
void display(int arr[],int len){
    for(int i=0;i<len;i++){
        printf("%d ",arr[i]);
    }
}
int main(){
    int arr[]={2,5,1,6,4,3};
    int len=sizeof(arr)/sizeof(arr[0]);
    printf("before sorting :");
    display(arr,len);
    quicksort(arr,0,len-1);
    printf("\nAfter sorting :");
    display(arr,len);
    return 0;
}