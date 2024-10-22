package Array;
class Movezero {
    public static void main(String[] args) {
        int temp=0;
        int j=0;
        int[] arr = {4,0,8,5,0,2};
        for(int i =0;i<arr.length;i++){
            if (arr[i] !=0 && arr[j]==0) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
