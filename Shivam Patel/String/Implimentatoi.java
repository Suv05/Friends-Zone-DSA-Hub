package String;

public class Implimentatoi {
    public static int myAtoi(String s) {
        
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;
        
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        int num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            if (num > (INT_MAX - digit) / 10) {
                return sign == 1 ? INT_MAX : INT_MIN;
            }
            
            num = num * 10 + digit;
            i++;
        }
        
        return num * sign;
    }
    public static void main(String[] args) {

        System.out.println(myAtoi("42"));             // Output: 42
        System.out.println(myAtoi("   -42"));         // Output: -42
        System.out.println(myAtoi("4193 with words")); // Output: 4193
        System.out.println(myAtoi("words and 987"));   // Output: 0
        System.out.println(myAtoi("-91283472332"));    // Output: -2147483648
        
    }
}
