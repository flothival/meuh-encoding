import java.util.Scanner;

public class Main {

    private static String encode(String s) {
        String meuh = "";
        for(int i = 0; i < s.length(); i++) {
            char lettre = s.charAt(i);
            String binary = Integer.toBinaryString(lettre);

            while(binary.length() < 8) {
                binary = "0" + binary;
            }

            char[] tab = binary.toCharArray();

            meuh += (tab[0] == '1') ? "M" : "h";
            meuh += (tab[1] == '1') ? "E" : "e";
            meuh += (tab[2] == '1') ? "U" : "u";
            meuh += (tab[3] == '1') ? "H" : "h";
            meuh += " ";
            meuh += (tab[4] == '1') ? "M" : "h";
            meuh += (tab[5] == '1') ? "E" : "e";
            meuh += (tab[6] == '1') ? "U" : "u";
            meuh += (tab[7] == '1') ? "H" : "h";
            meuh += " ";

        }

        return meuh;
    }
/* 
    @TODO
    private static String decode(String key) {

    }
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("************************************************\n*********** Welcome to MEUH encoding ***********\n************************************************\n\n");
        System.out.println("1. encode");
        System.out.println("2. decode");
        System.out.print("select a function : ");
        int choice = scanner.nextInt();
        scanner.nextLine();
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
                //System.out.println(decode(s));

                break;
        
            default:
                System.out.println("bad choice");
                break;
        }
        
    }
}