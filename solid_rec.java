import java.util.*;
public class solid_rec{
    public static void main(String[] args) {
        int init,count;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int col = sc.nextInt();
        for(init=0;init<col;init++){
            for(count=0;count<row;count++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}