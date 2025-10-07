import java.util.Scanner;

public class Main {

    @TODO
    private static String encode(String s) {

    }

    @TODO
    private static String decode(String key) {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("*********** Welcome to MEUH encoding ***********\n ********************************************\n\n");
        System.out.println("1. encode");
        System.out.println("2. decode");
        System.out.print("select a function : ");
        int choice = scanner.nextInt();
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
                System.out.println("bad choice");
                break;
        }
        
    }
}