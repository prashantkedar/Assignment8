/*The following arrays shows the profits of a company from 2001 to 2010:
int[] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
Write a program to find which year the decline in profits began. */
import java.util.Arrays;
import java.util.Scanner;


public class Question1 {

    public static void main(String[] args) {
    int [] profits = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
    for (int i = 0; i < profits.length; i++) {
        if (profits[i] > profits[i+1]) {
            System.out.print(i+1+2001);
            break;
        }
    }
    
    }
}