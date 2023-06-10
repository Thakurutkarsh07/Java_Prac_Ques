import java.util.*;
public class inverted_half_pyramid_with_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,col;
        System.out.println("Enter the height of pyramid");
        int height = sc.nextInt();
        col =height;
        for(i=1;i<=height;i++){
            for(j=1;j<=col;j++){
                System.out.print(j);
            }
            col--;
            System.out.println();
        }
    }
}
