import java.util.Scanner;

class Declaration{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter row");
        int n = sc.nextInt(); // Row
        System.out.println("Enter Col");
        int m = sc.nextInt(); // Col

        int arr[][] = new int[n][m];

        System.out.println("Enter Elements");
        for(int i=0; i < n;i++){
          for(int j=0; j<m;j++){
            arr[i][j] = sc.nextInt();
          }
      }

      System.out.println("The Entered Matrix is : ");

        for(int i=0; i < n;i++){
            for(int j=0; j<m;j++){
              System.out.print(arr[i][j]+ " ");
            }
          System.out.println();
        }
    }
}