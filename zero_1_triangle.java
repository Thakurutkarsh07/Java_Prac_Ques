import java.util.*;

import javax.print.event.PrintEvent;
public class zero_1_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter the height of pyramid");
        int height = sc.nextInt();
        for(i=1;i<=height;i++){
            for(j=1;j<=i;j++){
                if(i%2==0){
                    if(j%2==0){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }else{
                    if(j%2==0){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
        
    }
}
