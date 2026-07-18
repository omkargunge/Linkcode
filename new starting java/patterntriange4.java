public class patterntriange4 {
    
    
    
    
    public static void main(String[]args){
        for(int i=1;i<=4;i++){
            //space
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }
            //star
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}







