import java.util.Scanner;

public class inverted_half_pyramid {
    public static void main(String[] args) {
        int i,j,star;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the inverted pyramid");
        int height = sc.nextInt();
        star = height;
        for(i=1;i<=height;i++){
            for(j=star;j>=1;j--){
                System.out.print("*");
                
            }
        System.out.println();
        // System.out.print("*");
        star--;
        }
    }
}
