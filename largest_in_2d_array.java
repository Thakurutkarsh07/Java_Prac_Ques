import java.util.*;
public class largest_in_2d_array {
    public static void largestIn2dArr(int row,int col) {
        int matrix[][] = new int[row][col];
        int largestValue=Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]= sc.nextInt();
                if(matrix[i][j]>largestValue){
                    largestValue = matrix[i][j];
                }
            }
        }
        System.out.println("Largest value in the  given 2d array is: "+largestValue);
    }
    public static void main(String[] args) {
        largestIn2dArr(3, 3);
    }       
    
}
