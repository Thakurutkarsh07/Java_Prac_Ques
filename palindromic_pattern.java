import java.util.Scanner;
public class palindromic_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of Palindrome: ");
        int height = sc.nextInt();
        // int spaces = height-1;
        for(int i=1;i<=height;i++){
            for(int j=height-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int k =2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        
    }
}
