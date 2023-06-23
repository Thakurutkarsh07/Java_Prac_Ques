public class bubble_sort{
    public static void bubbleSort(int arr[]){
        for(int j=0;j<arr.length-1;j++){
            for(int i=0;i<arr.length-1-j;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]  = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={5,3,9,4,2,1};
        bubbleSort(arr);
        printArr(arr);
    }
}
