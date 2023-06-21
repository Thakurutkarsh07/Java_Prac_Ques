//By using Brute force approach.
public class max_sum_array {
    public static void maxSumArr(int arr[]) {
        int maxSum= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i; j<arr.length;j++){
                int end=j;
                int sum = 0;
                for(int k =start; k<=end;k++){
                    sum = sum+ arr[k];
                    System.out.println("Current subarray sum is: "+ sum);
                }
                if(sum>=maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("max sum = "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxSumArr(arr);
    }
}
