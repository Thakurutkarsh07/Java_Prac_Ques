public class get_set_clear_update_ith_bit {
    public static int getiThBit(int n,int i) {
        int Bitmask = 1<<i;
        if((n & Bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void setiThBIt(int n,int i) {
        int Bitmask = 1<<i;
        n = (n | Bitmask);
        System.out.println(n);
        
    }
    public static void cleariThBit(int n,int i) {
        int Bitmask= ~(1<<i);
        n = n&Bitmask;
        System.out.println(n);
    }
    public static void updateiThBit(int n, int i,int newBit) {
        int Bitmask=1<<i;
        if(newBit==0){
            cleariThBit(n, i);
        }
        else{
            setiThBIt(n, i);
        }
        
    }
    public static void main(String[] args) {
    System.out.println(getiThBit(10, 3));     
    setiThBIt(10, 2);  
    cleariThBit(10, 1); 
    updateiThBit(10, 3, 0);
    }
}
