public class patterntriangle5 {

    
    public static void main(String[]args){
        for(int i=4;i>=1;i--){
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









