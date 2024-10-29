public class closestnumbertozero{
    //Given an integer array nums of size n, return the number with the value closest to 0 in nums. If there are multiple answers, return the number with the largest value.
    public static void main(String[] args) {
        int nums[]={1,-1,0,-2,2,3,4};
        int closest =nums[0];
        for(int i=1 ; i<nums.length-1;i++){
            if(Math.abs(nums[i])<closest){
                closest=nums[i];
            }
            else if(Math.abs(nums[i])==Math.abs(closest) && nums[i]>closest){
                closest=nums[i];
            }
            else if(nums[i]==0){
                closest=0;

            }
            
        }
        System.out.println(closest);
        

    }
}