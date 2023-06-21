//including max negative values
public class kadanes_with_negative{
    public static void kadaneAlgo(int arr[]) {
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        boolean allNegative = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                allNegative= false;
                break;
            }
            else{
                allNegative = true;
            }

        }
        for(int i=0;i<arr.length;i++){
            if(allNegative==true){
                currSum = arr[i];
                maxSum = Math.max(maxSum, currSum);
                
            }
            else{
                currSum = currSum + arr[i];
                if(currSum<0){
                currSum=0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
    }
    System.out.println("Maximum sum of subarray is: "+maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {9,-2,-4,-3,-9};
        kadaneAlgo(arr);
    }
}