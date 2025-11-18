#include<stdio.h>

int main(){

    int rollno;
    char sname[10];
    int sub1,sub2,sub3,total;
    float perct;

    printf("enter student roll number");
    scanf("%d",&rollno);

    printf("enter student name");
    scanf("%s",sname);

    printf("enter subject marks");
    scanf("%d%d%d",&sub1,&sub2,&sub3);

    total=sub1+sub2+sub3;
    perct=total/3;

    printf("\n\t----------MARKSHEET----------");
    printf("\n\t\t ROLL NUMBER IS\t : %d",rollno);
    printf("\n\t\t STUDENT NAME IS : %s",sname);
    printf("\n\t\t MATH  \t\t : %d",sub1);
    printf("\n\t\t ENGISH IS \t : %d",sub2);
    printf("\n\t\t HISTORY IS \t : %d",sub3);
    printf("\n\t\t TOTAL IS \t : %d",total);
    printf("\n\t\t PERCT IS \t : %0.2f",perct);
    printf("\n\t----------THANKYOU----------");





}