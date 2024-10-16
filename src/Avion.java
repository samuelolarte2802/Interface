class Avion implements Volador {
    @Override
    public void despegar() {
        System.out.println("El avión está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión está aterrizando.");
    }

    @Override
    public void volar() {
        System.out.println("El avión está volando.");
    }
}
