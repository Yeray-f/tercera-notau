import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        final int ARTICULOS = 5;
        final int SUCURSALES = 4;

        double[] precios = new double[ARTICULOS];
        int[][] cantidades = new int[ARTICULOS][SUCURSALES];
        double[] recaudacionSucursal = new double[SUCURSALES];

        Scanner sc = new Scanner(System.in);

        leerPrecios(sc, precios);
        leerCantidades(sc, cantidades);
        mostrarCantidadesTotales(cantidades);
        mostrarSucursal2(cantidades);
        mostrarArticulo3Sucursal1(cantidades);
        calcularRecaudaciones(precios, cantidades, recaudacionSucursal);
        mostrarRecaudacionSucursales(recaudacionSucursal);
        mostrarSucursalMayorRecaudacion(recaudacionSucursal);

        sc.close();
    }

    public static void leerPrecios(Scanner sc, double[] precios) {
        System.out.println("Ingrese los precios de los 5 artículos:");
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
        }
    }

    public static void leerCantidades(Scanner sc, int[][] cantidades) {
        System.out.println("\nIngrese las cantidades vendidas (5 artículos x 4 sucursales):");
        for (int i = 0; i < cantidades.length; i++) {
            for (int j = 0; j < cantidades[i].length; j++) {
                System.out.print("Artículo " + (i + 1) + ", Sucursal " + (j + 1) + ": ");
                cantidades[i][j] = sc.nextInt();
            }
        }
    }

    public static void mostrarCantidadesTotales(int[][] cantidades) {
        System.out.println("\nCantidad total vendida de cada artículo:");
        for (int i = 0; i < cantidades.length; i++) {
            int total = 0;
            for (int j = 0; j < cantidades[i].length; j++) {
                total += cantidades[i][j];
            }
            System.out.println("Artículo " + (i + 1) + ": " + total);
        }
    }

    public static void mostrarSucursal2(int[][] cantidades) {
        System.out.println("\nCantidad total de artículos vendidos en la sucursal 2:");
        int total = 0;
        for (int i = 0; i < cantidades.length; i++) {
            total += cantidades[i][1];
        }
        System.out.println("Total en sucursal 2: " + total);
    }

    public static void mostrarArticulo3Sucursal1(int[][] cantidades) {
        System.out.println("\nCantidad del artículo 3 en la sucursal 1:");
        System.out.println("Artículo 3 - Sucursal 1: " + cantidades[2][0]);
    }

    public static void calcularRecaudaciones(double[] precios, int[][] cantidades, double[] recaudacionSucursal) {
        for (int j = 0; j < recaudacionSucursal.length; j++) {
            double totalSucursal = 0;
            for (int i = 0; i < precios.length; i++) {
                totalSucursal += precios[i] * cantidades[i][j];
            }
            recaudacionSucursal[j] = totalSucursal;
        }
    }

    public static void mostrarRecaudacionSucursales(double[] recaudacionSucursal) {
        double totalEmpresa = 0;
        System.out.println("\nRecaudación total por sucursal:");
        for (int j = 0; j < recaudacionSucursal.length; j++) {
            System.out.println("Sucursal " + (j + 1) + ": $" + recaudacionSucursal[j]);
            totalEmpresa += recaudacionSucursal[j];
        }
        System.out.println("\nRecaudación total de la empresa: $" + totalEmpresa);
    }

    public static void mostrarSucursalMayorRecaudacion(double[] recaudacionSucursal) {
        double mayor = recaudacionSucursal[0];
        int indice = 0;
        for (int i = 1; i < recaudacionSucursal.length; i++) {
            if (recaudacionSucursal[i] > mayor) {
                mayor = recaudacionSucursal[i];
                indice = i;
            }
        }
        System.out.println("\nLa sucursal con mayor recaudación es la Sucursal " + (indice + 1) + " con $" + mayor);
    }
}

