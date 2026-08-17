package trek;

public class Booking{ 

    private String name;
    private String mobile;
    private String fortName;
    private int people;
    private double price;
    private double totalPrice;
    
    

    Booking(String name,String mobile,String fortName,int people,double price){

        this.name=name;
        this.mobile=mobile;
        this.fortName=fortName;
        this.people=people;
        this.price=price;
        

        totalPrice=people*price;
    }
    
    

    void displayBooking(){

        System.out.println("----------------------------");
        System.out.println("Name         :"+name);
        System.out.println("Mobile       :"+mobile);
        System.out.println("Fort         :"+fortName);
        System.out.println("People       :"+people);
        System.out.println("Price/Person :Rs"+price);
        System.out.println("Total Price  :Rs"+totalPrice);
        System.out.println("----------------------------");
    }
}