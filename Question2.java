/*Store the following monthly sales report of a product in an array:
 January 125,000    July 105,000
February 93,000     August 120,000
March 80,000        September 90,000
April 75,000        October 115,000
May 84,000          November 123,000
June 110,000        December 150,000
Write a program to store the quarterly sales report in another array and
display the monthly, quarterly and total sales. (Note: January, February,
March form the first quarter)
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;


public class Question2 {

    public static void main(String[] args) {
    String [] month = {"January", "February", "March", "April", "May", "june", "Jully", "August", "September", "October", "November", "December" };
    int [] sales = {125000, 93000, 80000, 75000, 84000, 110000, 105000, 120000, 90000, 115000, 123000, 150000};
    int sum =0;
    for (int i = 0; i < sales.length; i++) {
        sum = sum + sales[i];
        }
        System.out.println("Yearly Total sales : " + sum);
        int Quarter1 = 0;
        int Quarter2 = 0;
        int Quarter3 = 0;
        int Quarter4 = 0;
        int QuarterSales [] = new int[4];

        System.out.println("Monthly sales report : " + Arrays.toString(sales));

    for (int i = 0; i < sales.length; i++) {
        if(i < 3){
            Quarter1 = Quarter1 + sales[i];
        } else if (i > 2 && i < 6) {
            Quarter2 = Quarter2 + sales[i];
        } else if ( i > 5 && i < 9) {
            Quarter3 = Quarter3 + sales[i];
        } else {
            Quarter4 = Quarter4 + sales[i];
        }
        }
    QuarterSales[0]= Quarter1;
    QuarterSales[1]= Quarter2;
    QuarterSales[2]= Quarter3;
    QuarterSales[3]= Quarter4;

    System.out.print("Quartly report : "+ Arrays.toString(QuarterSales));

    System.out.println();

    }
    
    }
