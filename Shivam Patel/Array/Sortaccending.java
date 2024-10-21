package Array;

class Sortaccending {
    public static void main(String[] args) {
        int temp = 0;
        int arr[] = {5,7,4,9,2};
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i =0;i < arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}