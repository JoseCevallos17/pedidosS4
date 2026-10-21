public class MainPedidos {
    public static void main(String[] args) {
        Pedido p1 = new Pedido("Jose", 120.50);
        Pedido p2 = new Pedido("Carlos", 45.00);
        Pedido p3 = new Pedido("Pedro", 80.00);

        p1.confirmar();
        p1.confirmar();
        p2.confirmar();

        System.out.println("Pedidos registrados: " + Pedido.getContadorPedidos());
        System.out.println("Total ventas: $" + Pedido.getVentasTotales());
        System.out.println("Estado p3 " + p3.getEstado());
    }
}
