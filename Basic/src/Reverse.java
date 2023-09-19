import java.awt.desktop.SystemEventListener;
import java.io.*;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse="";

        char ch;
        for (int i=0; i<A.length(); i++)
        {
            ch= A.charAt(i);
            reverse= ch+ reverse;
        }
        String result = (A.equals(reverse)) ? "Yes" : "No";
        System.out.println(result);
    }
}

