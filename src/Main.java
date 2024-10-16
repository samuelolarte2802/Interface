//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Samuel Olarte
        Volador miAvion = new Avion();
        Volador miSuperHeroe = new SuperHeroe();

        miAvion.despegar();
        miAvion.volar();
        miAvion.aterrizar();

        miSuperHeroe.despegar();
        miSuperHeroe.volar();
        miSuperHeroe.aterrizar();

    }
}