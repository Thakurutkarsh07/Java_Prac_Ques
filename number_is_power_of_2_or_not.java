public class number_is_power_of_2_or_not {
    public static void powerOf2(int num) {
        if((num&(num-1))==0){
        System.out.printf("%d is power of 2.",num);    
        }
        else{
            System.out.printf("%d is not a power of 2.",num);
        }
    }
    public static void main(String[] args) {
        powerOf2(3);
    }
}
