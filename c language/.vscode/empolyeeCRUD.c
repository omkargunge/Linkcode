#include<stdio.h>
#define MAX_EMPLOYEE 100
struct Employee {
    int id;
    char name[20];
    float salary;
    int age;
};

struct Employee employee[MAX_EMPLOYEE];
int count=0;

void addEmployee(){
    int n;
    printf("Enter number of employees to add: ");
    scanf("%d",&n);
    if(n>MAX_EMPLOYEE||count+n>MAX_EMPLOYEE){
        printf("MAX EMPLOYEE LIMIT REACHED....\n");
        return;
    }
    for(int i=0;i<n;i++){
        printf("ENTER DETAILS OF EMPLOYEE %d\n",i+1);
        printf("Enter Emp ID: ");
        scanf("%d",&employee[i].id);
        printf("Enter Emp Name: ");
        scanf("%s",&employee[i].name);
        printf("Enter Emp Salary: ");
        scanf("%f",&employee[i].salary);
        printf("Enter Emp Age: ");
        scanf("%d",&employee[i].age); 
        count++;    
    }
    printf("Employee added successfully!\n");
    
}
void viewAllEmployee(){
    if(count==0){
        printf("No Employee Record Found\n");
        return;
    }
    printf("Total Employees:%d\n",count);
    for(int i=0;i<count;i++){
        printf("======== Emp %d ========\n",i);
        printf("===============================================================");
        printf("|\tID\t|\tNAME\t|\tSALARY\t|\tAGE\t|\n");
        printf("===============================================================");
        printf("|\t%d\t|\t%s\t|\t%f\t|\t%d\t|\n",employee[i].id,employee[i].name,employee[i].salary,employee[i].age);
    }
        printf("===============================================================");
}

void searchEmployee(){
    int id;
    printf("Enter Id: ");
    scanf("%d",&id);
    for(int i=0;i<<count;i++){
        if(employee[i].id==id){
        printf("======== Emp %d ========\n",id);
        printf("===============================================================");
        printf("|\tID\t|\tNAME\t|\tSALARY\t|\tAGE\t|\n");
        printf("===============================================================");
        printf("|\t%d\t|\t%s\t|\t%f\t|\t%d\t|\n",employee[i].id,employee[i].name,employee[i].salary,employee[i].age);
        printf("===============================================================");
    }
    printf("No User Found For This ID.....");  
    }
}

int main(){
    int flag=1,choice;
    while(flag){
    printf("Employee Management System\n");
    printf("===========================\n");
    printf("1. Add Employee\n");
    printf("2. Display All Employees\n");
    printf("3. Search Employee\n");
    printf("4. Update Employee\n");
    printf("5. Delete Employee\n");
    printf("6. Exit\n");
    printf("===========================\n");
    printf("Enter your choice: ");
    scanf("%d",&choice);

        switch(choice){
            case 1:
                addEmployee();
                break;
            case 2:
                viewAllEmployee();
                break;
            case 3:
                //Employee();
                break;
            case 4:
                //addEmployee();
                break;
            case 5:
                //addEmployee();
                break;
            case 6:
                flag=0;
                break;
        }
    }
    return 0;
}