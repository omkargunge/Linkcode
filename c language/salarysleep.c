#include<stdio.h>

int main(){

    int empid;
    char empname[10];
    int basicsalary;
    float hra,ta,ma,pf,grosssalary;

    printf("enter employee id");
    scanf("%d",&empid);
    printf("enter employee name");
    scanf("%s",&empname);
    printf("enter employee basicsalary");
    scanf("%d",&basicsalary);

    hra=basicsalary*0.4;
    ta=basicsalary*0.09;
    ma=basicsalary*0.08;
    pf=basicsalary*0.07;
    grosssalary=basicsalary+hra+ta+ma-pf;

    printf("\n\t------------------------");
    printf("\n\temployee id is:%d",empid);
    printf("\n\temployee name is:%s",empname);
    printf("\n\temployee basicsalary is:%d",basicsalary);
    printf("\n\t-------------------------");
    printf("\n\temployee hra is:%.2f",hra);
    printf("\n\temployee ta is:%.2f",ta);
    printf("\n\temployee ma is:%.2f",ma);
    printf("\n\temployee pf is:%.2f",pf);
    printf("\n\temployee grosssalaty is:%.2f",grosssalary);
    printf("\n\t-------------------------");




    





}