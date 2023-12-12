import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
    //{{1, 2, 3}, {4, 5, 6} , {7, 8, 9}}
    System.out.print("Enter the value of square matrix (value of row and matrix): ");
    int value = sc.nextInt();
    int [][] m = new int[value][value];
    System.out.print("Enter the value of square matrix: ");
    for (int s = 0; s < value; s++) {
        for(int k=0;k<value;k++){
            m[s][k]=sc.nextInt();
        }
    
    }

     int sum = 0;
     int i = 0;
     int j = 0;
        for(i = 0; i <m.length; i++) {
            for(j = i; j<m[0].length; j++) {
            if (i == j) {
                sum = sum + m[i][j];
                break;
                }
            }
        } for(i = 0; i < m.length; i++) {
            for(j = 0; j < m[0].length; j++) {
            if(i + j == m.length-1) {
                sum = sum + m[i][j];
                break;
                }
            }
        } if(m.length %2 == 1) {
            i = m.length/2;
            sum = sum - m[i][i];
        }

        System.out.println("The sum of the matrix digonals: " + sum);
    }
}