import java.util.*;
public class romantointeger{

    public static int romanToInt(String str){
        int result = 0;
        int prevvalue = 0;

        for(int i=0;i<str.length();i++){
            int currentvalue=getValue(str.charAt(i));

            if(currentvalue<prevvalue){
                result=result+currentvalue;
            }
            else{
                result=result+currentvalue;
            }
            prevvalue=currentvalue;
        }
        return result;


    }

    public static int getValue(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
            // This should ideally never happen if input is valid
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roman value");
        String romann = sc.next();
        int value = romanToInt(romann);
        System.out.println("So the value of "+romann+" is "+value);

        
        

        
        

    }
}