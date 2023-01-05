import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        String str, reverse = "";
        int length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        str = scan.nextLine();
        length = str.length();
        for(int i = length-1; i>=0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("The reverse of given string is : " + reverse);
    }
}