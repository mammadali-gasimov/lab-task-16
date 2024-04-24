import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();
        boolean isPalindrome = isPalindromeNumber(num);
        System.out.println("The number " + num + " is palindrome: " + isPalindrome);
    }

    public static boolean isPalindromeNumber(int num) {
        int reversed = 0;
        int temp = num;

        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

        return reversed == num;
    }
}