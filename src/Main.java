import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Benvinguts a l'ordre del dia, trieu una opció:");
        System.out.println("1. Crea un contacte nou.");
        System.out.println("2. Cerca contactes existents.");
        System.out.println("3. Actualitza un contacte existent.");
        System.out.println("4. Suprimeix un contacte existent.");
        System.out.println("5. Sortir.");
        System.out.println(" ");
        System.out.println("Escogeix una opció");

        String opcion = sc.nextLine();

        if (opcion.equals("1")) {
            System.out.println("Has escollit l’opció que permet crear un contacte");
        }
        else if (opcion.equals("2")) {
            System.out.println("Has escollit l’opció que permet cercar un contacte existent");
        }
        else if (opcion.equals("3")) {
            System.out.println("Has escollit l’opció que permet actualitzar un contacte existent");
        }
        else if (opcion.equals("4")) {
            System.out.println("Has escollit l’opció que permet suprimir un contacte existent");
        }
        else if (opcion.equals("5")) {
            System.out.println("Has escollit l’opció que et fa sortir de l'agenda");
        }
        else {
            System.out.println("No s'ha entes la comanda");
        }
    }
}