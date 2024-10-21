import java.util.Scanner;
import Calculo.Procesos;
public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa resuelve ecuaciones de segundo grado.(ax^2 + bx + c = 0)");
        Double a = pedirnumero(scanner, "Por favor, introduzca el valor de a: ");
        Double b = pedirnumero(scanner, "Por favor, introduzca el valor de b: ");
        Double c = pedirnumero(scanner, "Por favor, introduzca el valor de c: ");
        Procesos.ecsegundogrado(a, b, c);
        scanner.close();
    }
    private static Double pedirnumero(Scanner scanner, String message) {
        Double numero = null;
        Boolean Numerovalido = false;
        while (!Numerovalido) {
            System.out.println(message);
            try {
                numero = Double.parseDouble(scanner.nextLine());
                Numerovalido = true;
            } catch (NumberFormatException e){
                System.out.println("Error: No has ingresado un valor válido. Intenta de nuevo.");
            } catch (Exception e){
                System.out.println("Ha ocurrido un error");
            }
        }
        return numero;
    }
}
