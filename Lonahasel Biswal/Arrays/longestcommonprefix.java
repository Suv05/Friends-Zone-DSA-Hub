public class longestcommonprefix {
    public static String longest(String[] strs){
        if (strs==null || strs.length==0){
            return " " ;
        }

        String prefix=strs[0];

        for(int i=1;i<strs.length;i++){
            int j=0;
            while(j<prefix.length() && j<strs[i].length() && prefix.charAt(j)==strs[i].charAt(j)){
                j++;
            }
            prefix=prefix.substring(0,j);

        }

        return prefix;
    }
    public static void main(String[] args) {
        String[] strings={"lona","love","lost"};
        System.out.println("Common substring : "+longest(strings));
    }

    
}
