public class clear_lastIbits {
    public static void clearLastIBits(int n,int i) {
        int bitmask=(~0)<<i;//-1or(~0)=all(1111111.....)
        System.out.println(n&bitmask);
    }
    public static void main(String[] args) {
        clearLastIBits(15, 2);
    }
}
