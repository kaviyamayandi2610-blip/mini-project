import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0, rem;

        while (temp > 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (rev == num)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is Not a Palindrome");

        sc.close();
    }
}