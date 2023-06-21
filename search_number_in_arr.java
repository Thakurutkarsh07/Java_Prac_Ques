import java.util.*;
public class search_number_in_arr {
    public static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {12,23,435,54,34,23,87,53};
        int key=504;
int index = search(arr, key);
if(index==-1){
    System.out.println("Not available");
}    
else{
    System.out.println("index of "+key+" is = "+index);
}
}   
    
}
