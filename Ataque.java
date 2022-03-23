public class Ataque {
    private String nombre;
    private int daño;
    private String tipo;

    public Ataque(String nombre, int daño, String tipo) {
        this.nombre = nombre;
        this.daño = daño;
        this.tipo = tipo;
    }

    public int getDaño() {
        return daño;
    }

}
