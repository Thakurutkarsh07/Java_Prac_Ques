import java.util.*;

public class binomial_theorem{
public static int factorial(int n) {
    int f=1;
    for(int i=n;i>=1;i--){
        f=i*f;
    }
    return f;
    
}
public static int bin_Coeff(int n,int r) {
    int n_fact = factorial(n);
    int r_fact = factorial(r);
    int fact_nmr= factorial(n-r);
    int binCoeff =  n_fact/(r_fact*fact_nmr);;
    return binCoeff;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r:");
        int r = sc.nextInt();
        System.out.println(bin_Coeff(n, r));
        
    }
}