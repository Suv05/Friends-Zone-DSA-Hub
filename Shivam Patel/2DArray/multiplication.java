import java.util.Scanner;

public class multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix1 row");
        int row1 = sc.nextInt(); // Row
        System.out.println("Enter Matrix1 Col");
        int col1 = sc.nextInt(); // Col

        System.out.println("Enter Matrix2 row");
        int row2 = sc.nextInt(); // Row
        System.out.println("Enter Matrix2 Col");
        int col2 = sc.nextInt(); // Col

        int arr1[][] = new int[row1][col1];
        System.out.println("Enter Elements for Matrix1");
        for(int i=0; i < row1;i++){
          for(int j=0; j<col1;j++){
            arr1[i][j] = sc.nextInt();
          }
      }

        int arr2[][] = new int[row2][col2];
        System.out.println("Enter Elements for Matrix2");
        for(int i=0; i < row2;i++){
          for(int j=0; j<col2;j++){
            arr2[i][j] = sc.nextInt();
          }
      }

        int arr3[][] =  new int [row1][col2];
        for(int i=0; i < row1;i++){
            for(int j=0; j<col2;j++){
                for(int k=0; k< row2; k++){
                    arr3[i][j] +=  arr1[i][k] * arr2[k][j];
                }              
            }
        }

        System.out.println("The Matrix is:");

        for(int i=0; i < row1;i++){
            for(int j=0; j<col2;j++){
                System.out.print(arr3[i][j]+ " ");             
            }
            System.out.println();
        }        
    }
}