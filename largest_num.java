public class largest_num {
    public static int find_largest(int arr[]) {
        int largest=Integer.MIN_VALUE;//-infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number of given array is: "+smallest);        
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,6,2,6,98,43,34,67,34};
        System.out.println("Largest number of given arrray is: "+find_largest(arr));
        }
}
