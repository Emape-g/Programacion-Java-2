public class PayPal implements Pago,PagoConDescuento{
    private String email;
    private double montoFinal;

    public PayPal(String email, double montoFinal) {
        this.email = email;
        this.montoFinal = montoFinal;
    }
    public PayPal(){

    }

    public double getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(double montoFinal) {
        this.montoFinal = montoFinal;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
