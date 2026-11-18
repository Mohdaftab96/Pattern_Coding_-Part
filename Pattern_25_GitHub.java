


// Enter the value : 5
//  1  2  3  4  5  5  4  3  2  1 
//  1  2  3  4  *  *  4  3  2  1 
//  1  2  3  *  *  *  *  3  2  1 
//  1  2  *  *  *  *  *  *  2  1 
//  1  *  *  *  *  *  *  *  *  1 


// Method 1
import java.util.Scanner;
public class Pattern_25_GitHub{
      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter the value : ");
            int n = sc.nextInt(); 
            
           
            
            for(int i=1; i<=n; i++){
                  for(int j=1; j<=n-i+1; j++){
                      System.out.print(j + " ");  
                  }
    
                  for(int j=2; j<=i; j++){
                      System.out.print("*" + " ");  
                  }
    
                  for(int j=2; j<=i; j++){
                      System.out.print("*" + " ");  
                  }
    
                  for(int j=n-i+1; j>0; j--){
                      System.out.print(j + " ");  
                  }
                
                  System.out.println();
            }
    
           
      
      }    
}






//Method 2



// import java.util.Scanner;
// public class Pattern_25_GitHub{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt(); // n1 = 4
        
//         //Upper Pyramid
//         for(int i=0; i<n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(j + " ");
//             }
            
//             for(int j=2; j<=i+1; j++){
//                 System.out.print("*" + " ");
//             }
            
//             for(int j=2; j<=i+1; j++){
//                 System.out.print("*" + " ");
//             }
            
//             for(int j=n-i; j>0; j--){
//                 System.out.print(j + " ");
//             }
            
//         System.out.println();
//         }
            
        
  
//     }
// }