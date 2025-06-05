public  class TarjetaCredito implements PagoConDescuento,Pago {
    private String numeroTarjeta;
    private double montoFinal;


    public TarjetaCredito(String numeroTarjeta, double montoFinal) {
        this.numeroTarjeta = numeroTarjeta;
        this.montoFinal = montoFinal;
    }
    public TarjetaCredito(){

    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        montoFinal = montoFinal * (1-porcentaje/100);
        System.out.println("Aplicando Descuento");
        System.out.println("El total es ahora" + montoFinal);
        procesarPago(montoFinal);
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando Pago "+ monto);
    }
}
