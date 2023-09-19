import java.util.Scanner;

public class Comparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        int start = 0;
        smallest = s.substring(start, k); //give a starting point of the first 3 characters
        largest = s.substring(start, k);
        while ((start + k) <= s.length()) {

            String Temp = s.substring(start, start + k);
            smallest = (smallest.compareTo(Temp) > 0) ? Temp : smallest;
            largest = (largest.compareTo(Temp) < 0) ? Temp : largest;
            start++;

        }
        return smallest + "\n" + largest;
    }
        public static void main (String[]args)
        {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }

}