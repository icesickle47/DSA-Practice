package src.com.kkdsa.strings;

public class StringPalindromes {
    public static void main(String[] args) {
        String str = "abcdcba";
        String str2 = "RaCEcAR";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str2));
    }

    static boolean isPalindrome(String str){
        if(str == null || str.length() == 0 ) return true; // no string provided

        str = str.toLowerCase();
        StringBuilder builder = new StringBuilder(str);
        int start = 0;
        int end = builder.length() - 1;

        while(start <= end){
            if (builder.charAt(start) == builder.charAt(end)){
                start++;
                end--;
            }
            else return false;
        }

        return true;
    }
}
