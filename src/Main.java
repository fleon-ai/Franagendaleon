import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wellcome to the agenda, please choose an option:");
        System.out.println("1. Create a new contact.");
        System.out.println("2. Search for existing contacts.");
        System.out.println("3. Upate an existing contact.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
        System.out.println(" ");
        System.out.println("Escogeix una opció");

        String opcion = sc.nextLine();

        System.out.print("Has escogit l'opcio ");
        System.out.println(opcion);
    }
}