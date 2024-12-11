package Array;
class Maxcircularsubarr {

    public int circularSubarraySum(int arr[]) {
        
        int n = arr.length; 
        int mn=Integer.MAX_VALUE, mx=Integer.MIN_VALUE;
        int sum1=0,sum2=0,total=0;
        
        for(int i=0;i<n;i++){
            total+=arr[i];
            
            sum2=Math.min(arr[i],sum2+arr[i]);
            mn=Math.min(mn,sum2);
            
            sum1=Math.max(arr[i],sum1+arr[i]);
            mx=Math.max(mx,sum1);
        }
        
         if (mx < 0) {
            return mx;
        }
       
        
        return Math.max(mx,total-mn);
        
    }

        public static void main(String[] args) {
            Maxcircularsubarr solution = new Maxcircularsubarr();
    
            int arr1[] = {8, -8, 9, -9, 10, -11, 12}; // Mixed values
            int arr2[] = {-1, -2, -3, -4};           // All negative values
    
            System.out.println(solution.circularSubarraySum(arr1)); // Output: 22
            System.out.println(solution.circularSubarraySum(arr2)); // Output: -1
        }
    
}
