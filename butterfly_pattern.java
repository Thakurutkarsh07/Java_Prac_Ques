import java.util.*;
public class butterfly_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,gap,k,l,star;
        System.out.println("Enter the height of butterfly");
        int height = sc.nextInt();
        gap = height-1;
            for(i=1;i<=height/2;i++){
                for(j=1;j<=height;j++){
                    if(j<=i){
                        System.out.print("*");
                    }
                    else if(j<=gap){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                gap=gap-1;
                System.out.println(); 
            }
            star = height/2;
            gap=height/2+1;
            for(k=1;k<=height/2;k++){
                for(l=1;l<=height;l++){
                    if(l<=star){
                        System.out.print("*");
                    }
                    else if(l<gap){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                gap=gap+1;
                System.out.println();
                star--;
            }
        
    }
}