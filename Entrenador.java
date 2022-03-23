import java.util.ArrayList;

public class Entrenador {
    private String nombre;
    private ArrayList<Pokemon> coleccion = new ArrayList<>();

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }
    public void agregarPokemon(Pokemon col){
        if(coleccion.size()<6){
            coleccion.add(col);
        }else{
            System.out.println("No se pueden agregar más Pokemons");
        }
    }

    public void desafiar(Entrenador coach1, Entrenador coach2){
        Pokemon a =

    }

}
