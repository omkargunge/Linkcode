#include<stdio.h>

int main(){

    int ch,ct;
    int c;
    
    

    treak:

    printf("\n----------WELCOME TREAKING----------");
    printf("\n1-Rajgad\n2-Torna\n3-Sinhgad");
    printf("\nchoice your favourite treak");
    scanf("%d",&ch);

    switch (ch) 
    {
    case 1:
    
        printf("\n----------RAJGAD-----------");
        printf("\n1 located\t\t\t : pune");
        printf("\n2 distance from pune\t\t : 60-65km");
        printf("\n3 timing\t\t\t : open 24 hours");
        
    break;

     case 2:
        printf("\n----------TORNA-----------");
        printf("\n1 located\t\t\t : pune");
        printf("\n2 distance from pune\t\t : 58km");
        printf("\n3 timing\t\t\t : 8am-5pm");
    break;

     case 3:
        printf("\n----------SINNHGAD-----------");
        printf("\n1 located\t\t\t : pune");
        printf("\n2 distance from pune\t\t : 40km");
        printf("\n3 timing\t\t\t : 6am-6pm");
    break;
    
    default:
        break;
    }

    printf("\ndo you want to continue press 1");
    scanf("%d",&ct);
    if(ct==1){
        goto treak;
    }
    printf("\ncontact-7625151518");
    printf("\n---------THANK YOU----------");
}