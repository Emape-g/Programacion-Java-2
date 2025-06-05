public class Pedido {
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente, String estado) {
        this.cliente = cliente;
        this.estado = estado;
    }

    public Pedido() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void cambiarEstado(String nuevoEstado){
        this.estado = estado;
        cliente.notificar("El estado de tu pedido ha cambiado a : " + nuevoEstado);
    }
}
