import java.util.Scanner;

public class wavetravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of row");
        int n = sc.nextInt();
        System.out.println("Enter no. of col");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the elements of the Matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Wave traversal matrix is");
        for(int j=0;j<m;j++){
            if (j%2==0) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            } else {
                for (int i = arr.length - 1; i >=0; i--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        sc.close();
    }
    
}
