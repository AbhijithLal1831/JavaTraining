import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

class validate{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String email="aswinsudhakaran@mystiquex.com";
        String regex="[a-z]+[_]{1}[a-z]+[@]{1}[a-z]+[\\.][a-z]{3}";
        Pattern pattern=Pattern.compile(regex);
        try {
            boolean match=pattern.matcher(email);

        }catch (PatternSyntaxException e)
        {
            System.out.println("Invalid");
        }

    }
}

