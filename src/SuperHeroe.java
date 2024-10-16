class SuperHeroe implements Volador {
    @Override
    public void despegar() {
        System.out.println("El superhéroe está despegando.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El superhéroe está aterrizando.");
    }

    @Override
    public void volar() {
        System.out.println("El superhéroe está volando.");
    }
}
