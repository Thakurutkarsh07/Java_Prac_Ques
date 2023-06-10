import java.util.*;
public class buttterfly_pattern_01 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of butterfly");
        int height = sc.nextInt();
        //for upper part stars
        for(int i=1;i<=height/2;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces

            int spaces = 2*(height/2-i);
            for(int j=1;j<=spaces;j++){
            System.out.print(" ");
            // spaces=spaces-2;
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
            System.out.println();
        }
        //lower  half
        for(int i=height/2;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces

            int spaces = 2*(height/2-i);
            for(int j=1;j<=spaces;j++){
            System.out.print(" ");
            // spaces=spaces-2;
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
            System.out.println();
        }
        }

    }

