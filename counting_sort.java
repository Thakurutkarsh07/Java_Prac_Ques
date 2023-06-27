//doubt
public class counting_sort {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                
            }
        }
    }
    public static void main(String[] args) {

    }
}
