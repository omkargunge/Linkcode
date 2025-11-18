 #include<stdio.h>

 int main(){

    int i,j,k,ct;

    ct=1;
    i=0;
    j=1;

    while (ct<10)
    {//4<=10
        k=i+j;
        printf("%5d",i);//1 2 3 5
        i=j;
        j=k;
        ct++;//ct=4
        
    }
    
 }