package Array;
class Secondmax {
    public static void main(String[] args) {
    int max = Integer.MIN_VALUE;
    int secmax = Integer.MIN_VALUE;
    int arr[]={5,9,2,4,7};
    for(int i=0;i<arr.length;i++){
        if (arr[i]>max) {
            secmax = max;
            max = arr[i];
        }
        else if(arr[i]>secmax && arr[i]!=max){
            secmax=arr[i];
        }

    }
    System.out.println(secmax);
  }
}
