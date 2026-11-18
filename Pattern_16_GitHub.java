

// Enter the value : 5
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3
// 1 2
// 1


//-------------------------------Problem 01-------------------------

 
import java.util.Scanner;
public class Pattern_16_GitHub{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = sc.nextInt(); 
        
        // Logic 1
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                    System.out.print(j + " ");
            }
            System.out.println();
        }

        // Logic 2
        // for(int i=0; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //        System.out.print(j + " ");
        //     } 
        //     System.out.println();
        // }







    }
}























