import java.util.Scanner;

public class Piscina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // PISCINA 1
        double largo1 = 300.3;
        System.out.print("Introduce el ancho de la primera piscina: ");
        double ancho1 = input.nextDouble();
        System.out.print("Introduce la profundidad de la primera piscina: ");
        double profundidad1 = input.nextDouble();

        // PISCINA 2
        double largo2 = 300.3;
        System.out.print("Introduce el ancho de la segunda piscina: ");
        double ancho2 = input.nextDouble();
        System.out.print("Introduce la profundidad de la segunda piscina: ");
        double profundidad2 = input.nextDouble();

        // Apartado 1
        int area1 = (int) (ancho1 * largo1);
        System.out.println("El área de la primera piscina es: " + area1 + " m²");
        int area2 = (int) (ancho2 * largo2);
        System.out.println("El área de la segunda piscina es: " + area2 + " m²");

        // Apartado 2
        int volumen1 = (int) (area1 * profundidad1);
        System.out.println("El volumen de la primera piscina es: " + volumen1 + " Litros");
        int volumen2 = (int) (area2 * profundidad2);
        System.out.println("El volumen de la segunda piscina és: " + volumen2 + " Litros");

        // Apartado 3
        double anchoTotal = ancho1 + ancho2;
        System.out.println("El ancho y el largo de ambas piscinas juntas es: " + largo1 + " m de largo y " + anchoTotal + " m de ancho");

        // Apartado 4
        int areaTotal = (int) (anchoTotal * largo1);
        System.out.println("El área de ambas piscinas es de: " + areaTotal + " m²");

        // Apartado 5
        int volumenTotal = (int) (areaTotal * profundidad1);
        System.out.println("El volumen de ambas piscinas es de: " + volumenTotal + " Litros");

        // Apartado 6
        double aux = profundidad1;
        profundidad1 = profundidad2;
        profundidad2 = aux;
        volumen1 = (int) (area1 * profundidad1);
        System.out.println("El nuevo volumen de la primera piscina es: " + volumen1 + " Litros");
        volumen2 = (int) (area2 * profundidad2);
        System.out.println("El nuevo volumen de la segunda piscina es: " + volumen2 + " Litros");

        input.close();
    }
}
