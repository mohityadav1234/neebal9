import java.util.Scanner;
 public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 0;
        int column = 0;
        int count = 0;
        System.out.println("Enter the no of rows : ");
        rows = sc.nextInt();
        System.out.println("Enter the no of colomn : ");
        column = sc.nextInt();

        int[][] grid = new int[rows][column];
        System.out.println("Enter matrix values : ");

        for (int i = 0 ; i < grid.length ; i++){
            for (int j = 0 ; j < grid.length ; j++){
                grid[i][j] = sc.nextInt();
            }
        }
       
        for (int i = 0; i < grid.length ; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < 0){
                    count += grid[i].length - j;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}