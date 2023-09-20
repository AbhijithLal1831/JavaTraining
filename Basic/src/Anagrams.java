import java.util.Locale;
import java.util.*;


public class Anagrams {

    static boolean isAnagram(String a, String b) {
        String word1=a;
        String word2=b;
        if(word1.length()!=word2.length())
        {
           return false;
        }
        String small1=word1.toLowerCase();
        String small2=word2.toLowerCase();
        char Ar1[]=small1.toCharArray();
        char Ar2[]=small2.toCharArray();
        java.util.Arrays.sort(Ar1);
        java.util.Arrays.sort(Ar2);
        return java.util.Arrays.equals(Ar1,Ar2);





    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}