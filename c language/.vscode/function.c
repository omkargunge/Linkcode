#include <stdio.h>
#define MAX_SIZE 100
int arr[MAX_SIZE];
int size=0;

void insert(){
    //right sheft
    //1 2 20 3 4 5 
    //0 1 2 3 4 
    //1 2 3 4 5
    int pos,newele;
    printf("enter a position: ");
    scanf("%d",&pos);//3
    printf("enter a new element :");
    scanf("%d",&newele);//20
    //1 2 20 3 4 5 
    //0 1 2 3 4 5 
    for(int i=size;i>=pos;i--){
        arr[i]=arr[i-1];

    }
    arr[pos-1]=newele;
    size++;

}
void update(){
    int pos,newele;
    printf("enter the position: ");
    scanf("%d",&pos);
    if (pos <= 0 || pos > size) {
        printf("Invalid position\n");
        return;5
        
    }

    printf("enter new element: ");
    scanf("%d", &newele);

    arr[pos - 1] = newele;
}


void delete(){
    int pos,newele;
    printf("enter the position: ");
    scanf("%d",&pos);

    for(int i=pos-1;i<size-1;i++){
        arr[i]=arr[i+1];
    }
    size--;

}
void display(){
    printf("value from array:\n");
    for(int i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}
int main(){

    int flag=1,choice;
    printf("enter no element for array:");
    scanf("%d",&size);
    printf("enter value for an array");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }


while (flag)
{
    printf("\n==Array operatiom===\n");
    printf("1.display\n2.Insert\n3.Delete\n4.update\n5.exit");

    scanf("%d",&choice);
    switch(choice){
        case 1:display();break;
        case 2:insert();break;
        case 3:delete();break;
        case 4:update();break;
        case 5:flag=0;break;
    }
}
return 0;

}