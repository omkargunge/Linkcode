import java.util.Scanner

public class product {
    //instance variable
    private int prodId;
    private String prodName;
    private float prodPrice;
    private int prodQty;
    private float total;
    private float cgst;
    private float sgst;
    private float finaltotal;
    //method
    public void CreateProduct(){
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter product id");
        prodId=sc.next();


        System.out.println("enter product name");
        prodName=sc.next();

        System.out.println("enter product price");
        prodPrice=sc.nextFloat();

        System.out.println("enter product qty");
        prodQty=sc.nameInt();

    public void calculateBill(){
        total=prodPrice*prodQty;
        CGSt=total*0.06f;
        SGST=total*0.06f;
        finalTotal=total+CGSt+SGST;


        public void display(){

            System.out.println("product ID : "+prodId);
            System.out.println("product Name : "+prodName);
            System.out.println("product price :"+prodPrice);
            System.out.println("priduct Quantity : "+prodQty);
            System.out.println("=======================================");
            System.out.println("total :" +total);
            System.out.println("CGST :" +CGST);
            System.out.println("SGST :" +SGST);
            System.out.println("finaltotal :" +finaltotal);
            System.out.println("==============================================");
            
            
        }
    }



        public class productMain{

            public static void main(String[] args){

                product prodobj=new product();
                prodobj.CreateProduct();
                prodobj.calculateBill();
                prodobj.displayProduct();
            }
        }


    }
}