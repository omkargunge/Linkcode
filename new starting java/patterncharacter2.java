public class patterncharacter2 {
    
    
    public static void main(String[]args){
        for (int i=1;i<=5;i++){
            //print space

            for(int j=5;j>i;j--){
                
                System.out.print(" ");
            }
            //print increasing latter
            for(char ch='a';ch<'a'+i;ch++){
                System.out.print(ch);
            }
            //print decreasing letter
            for(char ch=(char)('a'+i-2);ch>='a';ch--){
                System.out.print(ch);
            }
             System.out.println();
        }
    }
    
}









