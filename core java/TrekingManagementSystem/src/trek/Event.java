package trek;

public class Event{

    private String eventName;
    private String fortName;
    private String year;
    private String description;
    
    

    Event(String eventName,String fortName,String year,String description) {

        this.eventName=eventName;
        this.fortName=fortName;
        this.year=year;
        this.description=description;
    }
    
    

    void displayEvent(){

        System.out.println("----------------------------");
        System.out.println("Event       :"+eventName);
        System.out.println("Fort        :"+fortName);
        System.out.println("Year        :"+year);
        System.out.println("Description :"+description);
        System.out.println("----------------------------");
    }
}