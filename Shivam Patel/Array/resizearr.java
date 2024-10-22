package Array;

class Resizearr {

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int[] resize(int[]arr,int capacity){
        int[]temp = new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
        return arr;
    }
    public static void main(String[] args) {
        Resizearr rearr = new Resizearr();
        int[]original = new int[]{5,1,2,9,10};
        System.out.println("Original Size is - "+ original.length);
        original=rearr.resize(original, 10);
        System.out.println("Original size after resize - "+ original.length);
    }
}
