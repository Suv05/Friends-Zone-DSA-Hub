import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements of the array");
        for(int i= 0 ; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements of the array are : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Sorted Array : ");
        for(int i=0 ;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
