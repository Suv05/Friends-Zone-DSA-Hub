public class removeduplicates {

    public static int removeDuplicates(int []nums){
        if (nums.length==0){
            return 0;
        }
        
        int unique=0;
        for(int i=0;i<nums.length;i++){
            if(nums[unique]!=nums[i]){
                unique++;
                nums[unique]=nums[i];
            }
        }
        return unique+1;
    }
    
    public static void main(String[] args) {
        int []nums={1,1,2,2,3,3,4,5};
        int uniqueelement=removeDuplicates(nums);
        System.out.println("Unique Elements : "+uniqueelement);
        System.out.println("Modified Array : ");
        for (int i = 0; i < uniqueelement; i++) {
            System.out.println(nums[i]+" ");
        }
    }
}
