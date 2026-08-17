package trek;

public class Fort{

    private String name;
    private String location;
    private String history;
    
    

    Fort(String name,String location,String history){

        this.name=name;
        this.location=location;
        this.history=history;
    }
    
    

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }
 
    public String getHistory(){
        return history;
    }
    
    

    void display(){

        System.out.println("----------------------------");
        System.out.println("Fort Name :"+name);
        System.out.println("Location  :"+location);
        System.out.println("History   :"+history);
        System.out.println("----------------------------");
    }
}