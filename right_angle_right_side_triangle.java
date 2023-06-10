import java.util.*;
public class right_angle_right_side_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,blank,star;
        System.out.println("Enter the height of pyramid");
        int height = sc.nextInt();
        blank= height;
        star = height-1;
        for(i=1;i<=height;i++){
            for(j=1;j<=height;j++){
                if(j<=star){System.out.print(" ");
            }else{
                System.out.print("*");
            }
           
            }
            System.out.println();
            star--;
        }
    }
}
