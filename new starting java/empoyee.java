public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    ArrayList<Employee> obj=new ArrayList<Employee>(); //no limit
    boolean flag=true;

    while(flag){
    System.out.println("----Employee Management System-----");
    System.out.println("1.add Emploee");
    System.out.println("2.Show emp detail");
    int ch=sc.nextInt();
    switch(ch){
        case 1->{
            System.out.println("how many emp detail you want add:");
            int no=sc.nextInt();
            for(int i=1;i<=no;i++){
                System.out.println("enter emp id");
                int id=sc.nextInt();
                System.out.println("enter name");
                String name=sc.next();
                System.out.println("entern salary"); 
                double sal=sc.nextDouble();
                obj.add(new Empoyee(id, name, sal));              
            }
            System.out.println("Employee detail added");
        }
        case->
        obj.forEach(val->System.out.println("ID :"+val.getEmpid()+"\nName :"+val.getEname()+"\nSalary :"+val.getsal()));
    }
}

}