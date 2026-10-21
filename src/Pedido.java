public class Pedido {
    private int numero;
    private String cliente;
    private double total;
    private String estado;

    private static int contadorPedidos = 0;
    private static double ventasTotales = 0;

    public Pedido(String cliente, double total) {
        contadorPedidos++;
        this.numero = contadorPedidos;
        this.cliente = cliente;
        this.total = total;
        this.estado = "Pendiente";
    }

    public void confirmar() {
        if (!this.estado.equals("Confirmado")) {
            this.estado = "Confirmado";
            ventasTotales += this.total;
            System.out.println("Pedido " + this.numero + " confirmado");
        } else {
            System.out.println("El pedido " + this.numero + " ya estaba confirmado");
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }

    public static int getContadorPedidos() {
        return contadorPedidos;
    }

    public static double getVentasTotales() {
        return ventasTotales;
    }
}
