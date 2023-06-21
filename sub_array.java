public class sub_array {
    public static void subArray(int arr[]) {
        int ts = 0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                int sum = 0;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    sum = sum+arr[k];
                    
                }
                System.out.print(" Sum of this subarray is = "+ sum);
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarrays are: " + ts);
        }
    public static void main(String[] args) {
           int arr[]=  {1,2,3,4,5};
           subArray(arr);

    }
    
}
