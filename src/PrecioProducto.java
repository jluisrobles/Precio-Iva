public class PrecioProducto {
    public static void main(String[] args) {

        double precio = 1325.98;  // precio del producto
        int iva = 21;        // iva 21 %

        double caulculoIva = precio * iva / 100;       // calculo de Iva
        System.out.println("El  IVA es: " + caulculoIva);

        Double elPrecioCOnIva = precio + caulculoIva;    // Precio total del producto
        System.out.println("El precio total con IVA es: " + elPrecioCOnIva);
            }
}
