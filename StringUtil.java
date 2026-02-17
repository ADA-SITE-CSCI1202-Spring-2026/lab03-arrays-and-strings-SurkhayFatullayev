package week05;

import java.util.Scanner;

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


    public static String sorteString(String str) {
        char[] charArray = str.toCharArray();
        java.util.Arrays.sort(charArray);
        return new String(charArray);
    }

    public static String FirstLastWordSwitch(String str){
        if (str.length() <= 1) {
            return str;
        }
        String[] words = str.split(" ");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        String middlePart = str.substring(firstWord.length(), str.length() - lastWord.length());
        return lastWord + middlePart+ firstWord;
        
    }

    public static boolean anagram(String str1, String str2) {
        String sortedStr1 = sorteString(str1);
        String sortedStr2 = sorteString(str2);
        return sortedStr1.equals(sortedStr2);
    }

    public static void main(String[] args) {
        String str="I love black people community";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String strtoComp = scanner.nextLine();
        String reversedStr=StringUtil.reverse(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
        String explodedStr=StringUtil.explode(str);
        System.out.println("Exploded String: \n" + explodedStr);
        System.out.println("Sorted String: " + StringUtil.sorteString(str));
        System.out.println("String to Compare: " + StringUtil.sorteString(strtoComp));
        System.out.println("Word Switch: " + StringUtil.FirstLastWordSwitch(str));

        Boolean isAnagramBoolean=StringUtil.anagram(str, strtoComp);
        System.out.println("Is Anagram: " + isAnagramBoolean);
    }
}
