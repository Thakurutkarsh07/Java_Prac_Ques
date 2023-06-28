public class count_set_bits {
    public static void countSetBit(int n) {
        int count=0;
        int setBit=0;
        // int bitmask = n>>0;
        while(n!=0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        countSetBit(45);
    
        
    }
}
