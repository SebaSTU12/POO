import java.util.ArrayList;
import java.util.Arrays;

public class Pokemon {
    private int numero;
    private String nombre;
    private int vida;
    private String[] tipo;
    private int ataque;
    private int defensa;
    private int nivel;
    private ArrayList<Ataque> ataques = new ArrayList<>();

    public Pokemon(int numero, String nombre, String[] tipo) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = 100;
    }

    public Pokemon(int numero, String nombre, int vida, String[] tipo, int ataque, int defensa, int nivel) {
        this.numero = numero;
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", tipo=" + Arrays.toString(tipo) +
                ", nivel=" + nivel +
                '}';
    }

    public void agregarAtaque(Ataque a){
        if(ataques.size()<4){
            ataques.add(a);
        }else{
            System.out.println("No se pueden agregar más ataques");
        }
    }

    public void atacar(Pokemon p){
        Ataque a = ataques.get((int)(Math.random()*ataques.size()));
        int ataqueTotal = a.getDaño()+this.ataque;
        p.recibirDaño(ataqueTotal);
    }

    private void recibirDaño(int ataqueTotal) {
        int daño = ataqueTotal-this.defensa;
        this.vida-=daño;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
}

