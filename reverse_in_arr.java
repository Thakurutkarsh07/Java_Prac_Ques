import java.util.*;
public class reverse_in_arr {
    public static void reverseArr(int arr[]){
        int start = 0,end=arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[]= {3,45,6,75,45,23,87};
        reverseArr(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
