import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.*;

public class Syntaxchecker
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input = Integer.parseInt(in.nextLine());
        while(input>0){
            String tocheck = in.nextLine();
            try {
                Pattern p = Pattern.compile(tocheck);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            input--;

        }
    }
}