public class missingelementsinarrayusingxor {
    public static void main(String[] args) {
        int arr[]={3,2,1,5,6};
        int n=6;
        int xor_ofgivenarray=0;
        for(int i=0;i<arr.length;i++){
            xor_ofgivenarray=xor_ofgivenarray^arr[i];
        }
        int xor_ofactualarray=0;
        for(int i=1;i<=n;i++){
            xor_ofactualarray=xor_ofactualarray^i;
        }
        int missingelement=xor_ofactualarray^xor_ofgivenarray;
        // System.out.println(xor_ofactualarray);
        System.out.println(missingelement);



    }
}
