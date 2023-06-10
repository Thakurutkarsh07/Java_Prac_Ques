import java.util.*;
public class half_pyramid_by_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,num1=1;
        System.out.println("Enter the height of pyramid");
        int height = sc.nextInt();
        for(i=1;i<=height;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
                // num1++;
            }
            System.out.println();
        }
        
    }
}