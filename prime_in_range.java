public class prime_in_range {
    public static void primeRange(int n){
        for(int i=2;i<=n;i++){
            if(i==2||i==3){
                System.out.print(i+ ",");
            }
            else if(i%2==0||i%3==0){
                continue;
            }
            else{
                System.out.print(i+",");
            }
            
        }
    }
    public static void main(String[] args) {
        int n=20;
        primeRange(n);
    }
}
