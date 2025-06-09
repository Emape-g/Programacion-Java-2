//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        TarjetaCredito tc = new TarjetaCredito("123456789",20000);
        tc.aplicarDescuento(20);

        PayPal pp = new PayPal("emape@hotmail.com",30000);
        pp.aplicarDescuento(50);

    }
}