package Prácticas;
import java.util.Scanner;
public class POO_a2243330340_practica1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese código del concepto: ");
        String codigo = sc.nextLine();

        System.out.print("Ingrese descripción: ");
        String descripcion = sc.nextLine();

        System.out.print("Ingrese unidad de medida: ");
        String unidad = sc.nextLine();

        System.out.print("Ingrese cantidad: ");
        double cantidad = sc.nextDouble();

        System.out.print("Ingrese precio unitario: ");
        double precioUnitario = sc.nextDouble();

        Concepto concepto = new Concepto(codigo, descripcion, unidad, cantidad, precioUnitario);

        System.out.println("\nResumen del concepto:");
        System.out.println("Código: " + concepto.codigo);
        System.out.println("Descripción: " + concepto.descripcion);
        System.out.println("Unidad: " + concepto.unidad);
        System.out.println("Cantidad: " + concepto.cantidad);
        System.out.println("Precio unitario: $" + concepto.precioUnitario);
        System.out.println("Total: $" + concepto.calcularTotal());

        sc.close();
    }
}
