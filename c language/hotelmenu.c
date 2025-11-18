#include<stdio.h>

int main(){

    int ch1,ch2,ch3,ch4,ct,ct1,ct2;
    int ordno,vegno,nonvegno;
    int total=0;
    float cgst,sgst,finaltotal;


    menu:

    printf("\n1 starter\n2 veg\n3 nonveg\n4-bill");
    printf("\nenter your choice");
    scanf("%d",&ch1);

    switch (ch1) 
    {
    case 1:
        starter:
        printf("\n----------welcome starter-----------");
        printf("\n1- type1");
        printf("\n2-type2");
        printf("\nenter your choice");
        scanf("%d",&ch2);

        switch (ch2)
        {
        case 1:
            printf("\n----------TYPE STARTER----------");
            printf("\n1-starter1 :200");
            printf("\n2-starter1 :300");
            printf("\n3-starter1 :400");
            printf("\nenter your order no");
            scanf("%d",&ordno);

            if(ordno==1){
                total=total+200;
            }
            else if(ordno==2){
                total=total+300;
            }
            else if(ordno==3){
                total=total+400;
            }
            else{
                printf("\n invalid order number");
            }
            printf("\ndo you want to continue to starter press 1and for mainmenu press2");
            scanf("%d",&ct);

            if(ct==1){
                goto starter;
            }
            else if(ct==2){
                goto menu;
            }
        break;
        }
        
    break;

    case 2:
        veg:
        printf("\n----------welcome veg-----------");
        printf("\n1- type1");
        printf("\n2-type2");
        printf("\nenter your choice");
        scanf("%d",&ch3);

        switch (ch3)
        {
        case 1:
            printf("\n----------TYPE veg----------");
            printf("\n1-veg1 :200");
            printf("\n2-veg1 :300");
            printf("\n3-veg1 :400");
            printf("\nenter your order no");
            scanf("%d",&vegno);

            if(vegno==1){
                total=total+200;
            }
            else if(vegno==2){
                total=total+300;
            }
            else if(vegno==3){
                total=total+400;
            }
            else{
                printf("\n invalid order number");
            }
            printf("\ndo you want to continue to starter press 1and for mainmenu press2");
            scanf("%d",&ct1);

            if(ct1==1){
                goto starter;
            }
            else if(ct1==2){
                goto menu;
            }
        break;
        
        }
        
    break;
        
    break;

    case 3:
        nonveg:
        printf("\n----------welcome nonveg-----------");
        printf("\n1- type1");
        printf("\n2-type2");
        printf("\nenter your choice");
        scanf("%d",&ch4);

        switch (ch4)
        {
        case 1:
            printf("\n----------TYPE nonveg----------");
            printf("\n1-nonveg1 :200");
            printf("\n2-nonveg1 :300");
            printf("\n3-nonveg1 :400");
            printf("\nenter your order no");
            scanf("%d",&nonvegno);

            if(nonvegno==1){
                total=total+200;
            }
            else if(nonvegno==2){
                total=total+300;
            }
            else if(nonvegno==3){
                total=total+400;
            }
            else{
                printf("\n invalid order number");
            }
            printf("\ndo you want to continue to starter press 1and for mainmenu press2");
            scanf("%d",&ct2);

            if(ct2==1){
                goto starter;
            }
            else if(ct2==2){
                goto menu;
            }
        break;
        }
        
    break;
    break;
    
    case 4:
    cgst=total*0.06;
    sgst=total*0.06;
    finaltotal=total+cgst+sgst;

    printf("\n----------HOTEL BILL----------");
    printf("\ntotal bill :%d",total);
    printf("\ncgst :%f",cgst);
    printf("\nsgst :%f",sgst);
    printf("\n final total bill :%f",finaltotal);
    printf("\n----------thank you---------");
    break;
    

    
    
    }

    
    


    
}