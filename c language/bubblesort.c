#include<stdio.h>
#define max 20
int main(){

    int arr[max];
    int n,k;
    int i,j,temp;
    char ch;

    printf("how many elements do you want in array\n");
    scanf("%d",&n);

    printf("\nenter %d number in array\n",n);
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    //sorting..

    for(i=1;i<n;i++){

        for(j=0;j<n-i;j++){

            if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            printf("\nafter compare j=%d with j+1=%d\n",j,j+1);
            ch=getchar();
            for(k=0;k<n;k++){
                printf("%5d",arr[k]);

            }
        }
    }//end of i
    printf("\nafter bubble sort\n");
    for(i=0;i<n;i++){
        printf("%5d",arr[i]);
    }
}
