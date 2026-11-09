import java.util.Scanner;

public class SistemaMarcas {
    public static boolean validarDisponibilidad(String[] marcas, String nombreBuscado) {
        for (int i = 0; i < marcas.length; i++) {
            if (marcas[i] != null && marcas[i].equalsIgnoreCase(nombreBuscado)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] marcas = {"Naf Naf", "Americanino", "Esprit", null, null};
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- MENU EMBAJADOR ---");
            System.out.println("1. Ver Marcas\n2. Validar Disponibilidad\n3. Registrar Nueva\n4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcion) {
                case 1:
                    for (int i = 0; i < marcas.length; i++) {
                        if (marcas[i] != null) System.out.println("- " + marcas[i]);
                    }
                    break;
                case 2:
                    System.out.print("Marca a buscar: ");
                    if (validarDisponibilidad(marcas, teclado.nextLine())) System.out.println("SI esta disponible.");
                    else System.out.println("NO esta disponible.");
                    break;
                case 3:
                    System.out.print("Nueva marca: ");
                    String nueva = teclado.nextLine();
                    boolean guardado = false;
                    for (int i = 0; i < marcas.length; i++) {
                        if (marcas[i] == null) {
                            marcas[i] = nueva;
                            guardado = true;
                            System.out.println("Marca guardada.");
                            break;
                        }
                    }
                    if (!guardado) System.out.println("Error: Lista llena.");
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 4);
    }
}