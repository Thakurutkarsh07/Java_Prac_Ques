import java.util.Scanner;

public class diamond_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of diamond");
        int height = sc.nextInt();
        for(int i=1;i<=height;i++){
            for(int j=height-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=2*i-1;k>=1;k--){
                System.out.print("*");
                
            }
            System.out.println();
        }
        int star = height-1;
        for(int i=1;i<=height-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=star*2-1;k>=1;k--){
                System.out.print("*");
            }
            star--;
            System.out.println();
        
    }
  }
}
