package trek;

public class Guide extends Person{

    private String experience;
    
    

    Guide(String name,String mobile,String experience){
    	
    	super(name,mobile);
    	
        this.experience=experience;
        
    	}
    
    

    @Override
    void display(){

        System.out.println("----------------------------");
        System.out.println("Guide Name :"+getName());
        System.out.println("Mobile     :"+getMobile());
        System.out.println("Experience :"+experience);
        System.out.println("----------------------------");
    }
}     