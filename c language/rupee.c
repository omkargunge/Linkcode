#include<stdio.h>

int main(){

    int ch1,ch2;
    int ct;
    float input,result;

    printf("\n1-rupee\n2-dollar\n3-euro");
    printf("\nenter your choice");
    scanf("%d",&ch1);//ch1=1

    if(ch1==1){

        rupee:
        printf("enter your amount in rupee");
        scanf("%f",&input);//input=1000

        printf("\nenter your choise to convert your currency");
        printf("\n1-rupee\n2-doller\n3-euro");
        printf("enter your choice");
        scanf("%d",&ch2);//ch=2

        if(ch2==1){//rupee to rupee
            result=input;
            printf("\n%f rupee = %f rupee",input,result);


        }
        else if(ch2==2){//rupee to doller
            result=input/85.75;
            printf("\n%f rupee = %f doller",input,result);
        }
        else if("ch2==3"){//rupee to euro
            result=input/100.29;
            printf("\n%f rupee = %f euro",input,result);
            
        }
        printf("\ndo you want to continue rupee to any other currency press 1");
        scanf("%d",&ct);
        if(ct==1){
            goto rupee;

        }
            
    }//end rupee
    else if(ch1==2){
        //doller to other
    }
    else if(ch1==1){
        //euro to other
    }

    
}