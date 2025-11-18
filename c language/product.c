#include<stdio.h>

int main(){

    int prodid;
    char prodname[10];
    int prodqty,prodprice,total;
    float cgst,sgst,finaltotal;

    printf("enter product id");
    scanf("%d",&prodid);
    printf("enter product name");
    scanf("%s",&prodname);
    printf("enter product quentity");
    scanf("%d",&prodqty);
    printf("enter product price");
    scanf("%d",&prodprice);

    total=prodprice*prodqty;
    cgst=total*0.06;
    sgst=total*0.06;
    finaltotal=total+cgst+sgst;

    printf("\n\t-------WELCOME-------");
    printf("\n\tproduct id is :%d",prodid);
    printf("\n\tproduct name is :%s",prodname);
    printf("\n\tproduct quentity is :%d",prodqty);
    printf("\n\tproduct price is :%d",prodprice);
    printf("\n\t-----------------------------");
     printf("\n\ttotal is :%d",total);
    printf("\n\tcgst is :%.2f",cgst);
    printf("\n\tsgst is :%.2f",sgst);
    printf("\n\tfinaltotal is :%.2f",finaltotal);
    printf("\n---------------------------");

}