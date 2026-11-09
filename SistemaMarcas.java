import java.util.Scanner;
public class SistemaMarcas {
    public static void main(String[] args) {
        String[] marcas = {"Naf Naf", "Americanino", "Esprit", null, null};
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n1. Ver Marcas\n4. Salir");
            System.out.print("Elige: ");
            opcion = teclado.nextInt();
            if(opcion == 1) System.out.println("Mostrando marcas...");
        } while (opcion != 4);
    }
}