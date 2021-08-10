
package all_practics_java_file;


public class break_continue {
    public static void main(String[] args) {
        
        int i=1;
        
        for (int j = 1; j <= 100; j++) {
            
            if(j==10){
                 break;
      }
               
            System.out.println(""+j);
            
        }
        
        for (int j = 0; j <=100; j++) {
            
            if (j==10) {
                continue;
                
            }
            System.out.println(""+j);
        }
        
        
    }
    
}
