import java.util.Scanner;

public class StringEncryptor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        String encrypted = encrypt(input);

        System.out.println(encrypted);

        scanner.close();
    }

    public static String encrypt(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                int shift = ch;

                int originalPosition = ch - 'a';
                int newPosition = (originalPosition + shift) % 26;
                char encryptedChar = (char) ('a' + newPosition);

                result.append(encryptedChar);
            } else {

                result.append(ch);
            }
        }

        return result.toString();
    }
}