// #include<stdio.h>
// #include<stdlib.h>

// int main(){
//     int *ptr;
//     int n;
//     printf("enter the size of arrya:");
//     scanf("%d",&n);

//     ptr=(int*)malloc(n*sizeof(int));

//     printf("enter the value of array:");
//     scanf("%d",&n);
    

//     for(int i=0;i<n;i++){
//         ptr[i]=i+1;
//         printf("%d ",ptr[i]);

//     }
//     int max=ptr[0];
//     for(int i=0;i<n;i++){
//         if(ptr[i]>max){
//             max=ptr[i];
//         }
//     }
//     printf("max :%d",max);
//     return 0;

// }
#include<stdio.h>
#include<stdlib.h>

int main(){
    int n,i;
    int *ptr;
    int max;
    printf("enter the number of element:");
    scanf("%d",&n);

    ptr=(int*)malloc(n*sizeof(int));
    if(ptr==NULL){
        printf("calloc failed....");
        return 1;
    }
    printf("enter the value of array:");
    for(i=0;i<n;i++){
        scanf("%d",&ptr[i]);
    }
    
    max=ptr[0];
    for(int i=0;i<n;i++){
        if(ptr[i]<max){
            max=ptr[i];
        }
    }
    printf("max value is :%d",max);
    return 0;

}