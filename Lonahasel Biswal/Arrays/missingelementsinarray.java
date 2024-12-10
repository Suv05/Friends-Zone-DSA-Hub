//Array of numbers from 1 to n and find the missing number between these
public class missingelementsinarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6};
        int n=6;//given that 6 elements should be present in the array(from 1 to 6)
        int actual_sum=(n*(n+1))/2;
        int sum_here =0 ;
        for(int i=0;i<arr.length;i++){
            sum_here=sum_here+arr[i];
        }
        int missingelement=actual_sum - sum_here;
        System.out.println("Missing element : "+missingelement);
        

    }
}
