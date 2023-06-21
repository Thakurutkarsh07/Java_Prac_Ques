import java.util.*;
public class decimal_to_binary {
    public static void dec_To_Bin(int decNum){
        int myNum=decNum;
        int binNum=0;
        int pow=0;
        while (decNum>0){
            int rem = decNum%2;
            binNum = binNum + (rem*(int)Math.pow(10, pow));
            pow++;
            decNum=decNum/2;
            
        }
        System.out.println("binary form of "+ myNum+" is = " + binNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number to convert it into binary form: ");
        int decNum = sc.nextInt();
        dec_To_Bin(decNum);
    }
}
