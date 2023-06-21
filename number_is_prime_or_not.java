import java.util.*;
public class number_is_prime_or_not {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){
            if(i%n==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not:");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    } 
    
}
