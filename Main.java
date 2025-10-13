import java.util.Scanner;

public class Main {

    /**
     * Encodes a given string into a custom "MEUH" binary-based format.
     * Each character is converted to its 8-bit binary representation.
     * Uppercase letters (M, E, U, H) represent binary 1s,
     * while lowercase letters (m, e, u, h) represent binary 0s.
     */
    private static String encode(String s) {
        String meuh = "";

        for (int i = 0; i < s.length(); i++) {
            char lettre = s.charAt(i);

            // Convert character to binary string (base 2)
            String binary = Integer.toBinaryString(lettre);

            // Ensure the binary string is exactly 8 bits long (pad with zeros)
            while (binary.length() < 8) {
                binary = "0" + binary;
            }

            // Convert binary string to char array for bit-by-bit access
            char[] tab = binary.toCharArray();

            // Encode first 4 bits
            meuh += (tab[0] == '1') ? "M" : "m";
            meuh += (tab[1] == '1') ? "E" : "e";
            meuh += (tab[2] == '1') ? "U" : "u";
            meuh += (tab[3] == '1') ? "H" : "h";
            meuh += " ";

            // Encode last 4 bits
            meuh += (tab[4] == '1') ? "M" : "m";
            meuh += (tab[5] == '1') ? "E" : "e";
            meuh += (tab[6] == '1') ? "U" : "u";
            meuh += (tab[7] == '1') ? "H" : "h";
            meuh += " ";
        }

        return meuh;
    }

    /**
     * Decodes a "MEUH" string back into its original text.
     * Uppercase letters represent '1', lowercase letters represent '0'.
     * Spaces are ignored during decoding.
     */
    private static String decode(String key) {
        String binary = "";
        String result = "";

        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);

            // Skip spaces (they separate MEUH groups)
            if (c == ' ')
                continue;

            // Uppercase = 1, lowercase = 0
            binary += Character.isUpperCase(c) ? "1" : "0";

            // Once we have 8 bits, convert to a character
            if (binary.length() == 8) {
                int valeur = Integer.parseInt(binary, 2);
                result += (char) valeur;
                binary = ""; // reset for the next character
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simple CLI interface for encoding and decoding
        System.out.print(
                "************************************************\n*********** Welcome to MEUH encoding ***********\n************************************************\n\n");
        System.out.println("1. encode");
        System.out.println("2. decode");
        System.out.print("select a function : ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String s = "";

        switch (choice) {
            case 1:
                System.out.println("Please enter a sentence : ");
                s = scanner.nextLine();
                System.out.println(encode(s));
                break;

            case 2:
                System.out.println("Please enter the key : ");
                s = scanner.nextLine();
                System.out.println(decode(s));
                break;

            default:
                System.out.println("Bad choice");
                break;
        }

        scanner.close();
    }
}
