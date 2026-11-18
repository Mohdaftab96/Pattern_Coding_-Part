



// Enter the value : 7
// 1 
// 2  3
// 4  A 5
// 6  B C 7
// 8  D E F 9
// 10 G H I J 11
// 12 K L M N O 13



import java.util.Scanner;
public class Pattern_19 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = sc.nextInt();  // n = 3
        
        
        int count1 = 1;
        int count2 = 1;
        // char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                
                    if(j==1 || i==j){

                        System.out.print(count1 + " ");
                        count1 = count1 + 1;

                    }else{
                        
                        char ch = (char)('A' + count2 - 1);
                        System.out.print(ch + " ");
                        count2 = count2 + 1;
                    }
                }
            System.out.println();
        }
    }
}