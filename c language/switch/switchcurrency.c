#include<stdio.h>

int main(){

    int ch1,ch2,ct,ch3,ch4;
    float input,result;

    printf("\ncurrency conversion");
    printf("\n1-rupee\n2-doller\n3-euro");
    printf("\nenter your choice");
    scanf("%d",&ch1);

    switch (ch1)
    {
    case 1://rupee conversion
    rupee:
        printf("\nenter your amount in rupee");
        scanf("%f",&input);

        printf("\nenter your choice to convert");
        printf("\n1-rupee\n2doller\n3-euro");
        scanf("%d",&ch2);

        switch (ch2)
        {
        case 1://rupee to rupee
            result=input;
            printf("\n%.2f rupee = %.2f rupee",input,result);
        break;
        
        case 2://rupee to doller
            result=input/86.02;
            printf("\n%.2f rupee = %.2f doller",input,result);
        break;

        case 3://rupee to euro
            result=input/99.68;
            printf("\n%.2f rupee = %.2f euro",input,result);
        break;
        }
        printf("\ndo yo want to convert rupee again press1");
        scanf("%d",&ct);
            if(ct==1){
                goto rupee;
            }
        printf("\n----------thank you-----------");   


        
    break;//end rupee
    
    case 2://doller conversion
    doller:
        printf("\nenter your amount in doller");
        scanf("%f",&input);

        printf("\nenter your choice to convert");
        printf("\n1-rupee\n2doller\n3-euro");
        scanf("%d",&ch3);

         switch (ch3)
        {
        case 1://doller to rupee
            result=input*86.02;
            printf("\n%.2f doller = %.2f rupee",input,result);
        break;
        
        case 2://doller to doller
            result=input;
            printf("\n%.2f doller = %.2f doller",input,result);
        break;

        case 3://doller to euro
            result=input*0.86;
            printf("\n%.2f doller = %.2f euro",input,result);
        break;
        }
        printf("\ndo yo want to convert doller again press1");
        scanf("%d",&ct);
            if(ct==1){
                goto doller;
            }
        printf("\n----------thank you-----------");

        
    break;

    case 3://euro conversion
    euro:
        printf("\nenter your amount in euro");
        scanf("%f",&input);

        printf("\nenter your choice to convert");
        printf("\n1-rupee\n2doller\n3-euro");
        scanf("%d",&ch4);

         switch (ch4)
        {
        case 1://euro to rupee
            result=input*0.010;
            printf("\n%.2f euro = %.2f rupee",input,result);
        break;
        
        case 2://euro to doller
            result=input*0.86;
            printf("\n%.2f euro = %.2f doller",input,result);
        break;

        case 3://euro to euro
            result=input;
            printf("\n%.2f euro = %.2f euro",input,result);
        break;
        }
        printf("\ndo yo want to convert euro again press1");
        scanf("%d",&ct);
            if(ct==1){
                goto euro;
            }
        printf("\n----------thank you-----------");



    break;
    }
}