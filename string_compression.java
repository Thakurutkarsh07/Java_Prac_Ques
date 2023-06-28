public class string_compression {
    public static void strCompression(String str) {
        StringBuilder sb = new StringBuilder("");
        char start = str.charAt(0);
        int num=0;
        for(int i=1;i<str.length();i++){
            if(i==str.length()-1&&str.charAt(i-1)==str.charAt(i)){
                num++;
                sb.append(str.charAt(i-1));
                sb.append(num+1);
            }
            else if(str.charAt(i-1)==str.charAt(i)){
                num++;
            }
            else if(i==str.length()-1&&str.charAt(i-1)!=str.charAt(i)){
                sb.append(str.charAt(i-1));
                sb.append(num+1);
                sb.append(str.charAt(i));
                sb.append('1');
            }
            else{
                sb.append(str.charAt(i-1));
                sb.append(num+1);
                num =0;

            }
        }
        System.out.println(sb);
    }
    public static void strCompressionOpt(String str) {
        // int count=0;
        String compressedString = "";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            compressedString+=str.charAt(i);
            if(count>1){
                compressedString+=count.toString();
            }
        }
        System.out.println(compressedString);
    }
    public static void main(String[] args) {
        String str = "aaaabbcccdss";
        strCompressionOpt(str);
        strCompression(str);
    }
}