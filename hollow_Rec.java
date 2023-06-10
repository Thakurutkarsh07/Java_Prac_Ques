import java.util.*;
public class hollow_Rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1,count2;
        System.out.println("Enter number of columns");
        int col = sc.nextInt();
        System.out.println("Enter number of rows");
        int row = sc.nextInt();
        for(count1=1;row>=count1;count1++){
            for(count2=1;col>=count2;count2++){
                if(count2==1 || count2==col || count1==row || count1==1){
                    System.out.print("* ");
                }        
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        
    }
}