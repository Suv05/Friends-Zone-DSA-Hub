import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter Elements of the Array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int unsorted=arr[i];//This simply represents the unsorted array..we are taking 1st element as sorted and the next element as unsorted and in the next iteration two element as sorted and continues..
            for(int j=i-1;j>=0;j--){// here we implemented j>=0 bczwe need to compare till 0th element of the array.. 
                if(arr[j]>unsorted){//And Then Just did swapping as per the condition..
                    arr[j+1]=arr[j];
                    arr[j]=unsorted;
                }
            }
        }
        System.out.println("Sorted Array would be : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
