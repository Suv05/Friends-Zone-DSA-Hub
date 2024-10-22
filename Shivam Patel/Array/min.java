package Array;
class Min {
    public static void main(String[] args) {
        int arr[] = {4,8,5,2,7,1};
        int minnum = arr[0];
        for(int i =0; i<arr.length;i++){
            if (minnum>arr[i]) {
                minnum = arr[i];
            }
        }
        System.out.println(minnum);
    }
}
