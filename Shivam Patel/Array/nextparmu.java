package Array;

class nextparmu {
    static void nextPermutation(int[] arr) {

        int i =arr.length-2;
        
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=arr.length-1;
            while(arr[i]>=arr[j]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);
    }
    
    public static void swap(int[]arr,int i,int j){
        int tmp = arr[i];
        arr[i]  = arr[j];
        arr[j]  = tmp;
    }
    
    public static void reverse(int[]arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
           
        int[] arr = {1, 2, 3};
        System.out.println("Original Array: " + java.util.Arrays.toString(arr));
        
        nextPermutation(arr);
        
        System.out.println("Next Permutation: " + java.util.Arrays.toString(arr));
    }
}
