//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
public class mergestringsalternatively {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "pqr";

        // int totallength=str1.length()+str2.length();
        String result=" ";
        int maxlength=Math.max(str1.length(),str2.length());

        // for (int i=0 ; i<str1.length() ;i++){
        //     System.out.print("Character at index " + i +" is "+str1.charAt(i)+"\n");
        // }
        // for(int j=0 ; j<str2.length();j++){
        //     System.out.print("Character at index " + j +" is "+str2.charAt(j)+"\n");
        // }

        for(int i=0;i<maxlength;i++ ){
            if(i<str1.length()){
                result=result+str1.charAt(i);
            }
            if(i<str2.length()){
                result=result+str2.charAt(i);
            }
        }
        System.out.println(result);
   
    }
}
