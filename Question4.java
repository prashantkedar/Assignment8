/*    1
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4 */
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 4; i++) {
            for (int j = 1 ; j <= 4 - i; j++) {
                System.out.print("  ");
            }
            for (int j = i ; j >= 1 ; j--) {
                System.out.print(j + " ");    
            }
            for (int j = 2 ; j <=  i ; j++) {
                System.out.print(j + " "); 
            }
            System.out.println();
        }
    }
}