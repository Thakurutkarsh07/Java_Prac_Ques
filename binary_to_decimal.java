import  java.util.*;
public class binary_to_decimal {
    public static void bin_to_dec(int binNum) {
        int pow=0;
        int decNum=0;
        int myNum = binNum;
        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit*(int)Math.pow(2, pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of " + myNum + " is = " +decNum);

    }
    public static void main(String[] args) {
        bin_to_dec(101);
    }  
    
}
