public class fast_exponential {
    public static void fastExponential(int n,int exp) {
        // int num =exp;
        float mult=1;
        int count=0;
        float total = 1;
        while (exp!=0) {
            int lsb = exp&1;
            mult = (float)Math.pow(2, count);
            mult  = mult*lsb;
            total= total * (float)(Math.pow(n, mult));
            count++;
            exp=exp>>1;
        }
        System.out.println(total);
    }
    public static void main(String[]  args) {
        fastExponential(2, 4);        
    }
}
