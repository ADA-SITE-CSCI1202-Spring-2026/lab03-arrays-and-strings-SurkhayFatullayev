package week05;

public class StringUtil {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i =sb.length() - 1; i >= 0; i--) {
            char c=sb.charAt(i);
            sb.append(c);
        }
        return sb.toString();
    }

    public static String explode(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.substring(0, i + 1));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str="Baku";
        String reversedStr=StringUtil.reverse(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
        String explodedStr=StringUtil.explode(str);
        System.out.println("Exploded String: \n" + explodedStr);
    }


}