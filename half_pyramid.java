import java.util.*;
public class half_pyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j,i;
        System.out.println("Enter the height of the pyramid");
        int height = sc.nextInt();
        for (i=1;i<=height;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}