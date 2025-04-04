//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Gallina g1 = new Gallina(10,2);
        Gallina g2 = new Gallina(9,3);
        g1.mostarEstado();
        g2.mostarEstado();
        g1.ponerHuevo();
        g1.envejecer();
        g2.ponerHuevo();
        g2.envejecer();
        g1.mostarEstado();
        g2.mostarEstado();
    }
}