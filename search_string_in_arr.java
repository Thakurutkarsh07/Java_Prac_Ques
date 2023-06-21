public class search_string_in_arr {
    public static int search(String arr[],String key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        
        }
        return -1;
    }
    public static void main(String[] args) {
        String arr[] = {"Mango","Grapes","Dragon fruit","Guava","Banana"};
        String key="Guava";
int index = search(arr, key);
if(index==-1){
    System.out.println("Not available");
}    
else{
    System.out.println("Index of "+key+" is = "+index);
}
}   
    
    }      
    

