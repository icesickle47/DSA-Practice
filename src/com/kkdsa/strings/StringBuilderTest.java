package src.com.kkdsa.strings;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append(123).reverse();

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            System.out.println(ch);
            builder.append(ch);
        }

        String newstr = builder.reverse().toString();
        System.out.println(newstr);
    }


}
