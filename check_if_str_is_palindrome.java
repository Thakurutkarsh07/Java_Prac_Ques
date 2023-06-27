public class check_if_str_is_palindrome {
    public static void  checkPalindrome(String str){
        boolean palindrome= true;
        int n =str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                palindrome=false;
            }
        }
        System.out.println(palindrome);
    }
   public static void main(String[] args) {
    String str=  "madam";
        checkPalindrome(str);
    }
}
