import java.io.*;
import java.util.*;

public class Regularexpression {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if(s.trim().isEmpty())
        {
            System.out.println("0");
        }
        else
        {
            String[] tokens = s.trim().split("[\\s!?,._'@]+");

            System.out.println(tokens.length);

            for(int i=0;i< tokens.length;i++)
            {
                System.out.println(tokens[i]);
            }
            scan.close();
        }
    }
}


