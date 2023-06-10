import java.util.Scanner;
public class number_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of number pyramid: ");
        int height = sc.nextInt();
        for(int i=1;i<=height;i++){
            for(int k=height-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
