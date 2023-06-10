import java.util.*;
public class solid_rhombus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of rhombus: ");
        int width = sc.nextInt();
        for(int i=width;i>=1;i--){
                //spaces
                for(int k=i-1;k>=1;k--){
                    System.out.print(" ");
                }
                for(int l=width;l>=1;l--){
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
