public class subsequence {
    public static boolean subsequenceornot(String str,String tocheck){
        int i=0;
        for(int j=0;i<str.length()&&j<tocheck.length();j++){
            if(str.charAt(i)==tocheck.charAt(j)){
                i=i+1;
            }
        }
        return i==str.length();
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "agbdc";
        System.out.println(subsequenceornot(s, t));
    }
}
