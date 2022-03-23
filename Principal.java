public class Principal {
    public static void main(String[] args) {

        String[] tipo0 = {"Fuego"};
        Pokemon p1 = new Pokemon(4,"Charmander",tipo0);
        p1.setAtaque(15);

        String[] tipo1 = {"Planta", "Veneno"};
        Pokemon p2 = new Pokemon(1,"Bulbasaur", 100, tipo1, 10, 10, 1);

        String[] tipo2 = {"Agua"};
        Pokemon p3 = new Pokemon(7,"Squirtle", 100, tipo2, 10, 10,1);
        Pokemon p6 = new Pokemon(54, "Psyduck", 100, tipo2, 10, 10 ,1);

        String[] tipo3 = {"Electrico"};
        Pokemon p4 = new Pokemon(25,"Pikachu",100, tipo3, 10, 10, 1);

        String[] tipo4 = {"Normal", "Hada"};
        Pokemon p5 = new Pokemon(39,"Jigglypuff", 100, tipo4, 10, 10,1);


        Ataque arañazo = new Ataque("Arañazo", 10, "Normal");
        Ataque placage = new Ataque("Placaje", 5, "Normal");
        Ataque torrente = new Ataque("Torrente", 4,"Normal");
        Ataque eleEstatica = new Ataque("Electricidad Estatica", 7, "Normal");
        Ataque granEncanto = new Ataque("Gran Encanto",4,"Normal");
        Ataque tenacidad = new Ataque("Tenacidad", 4,"Normal");
        Ataque humedad = new Ataque("Humedad", 6, "Normal");
        Ataque aclimatacion = new Ataque("Aclimatación", 2, "Normal");

        p1.agregarAtaque(arañazo);
        p2.agregarAtaque(placage);
        p3.agregarAtaque(torrente);
        p4.agregarAtaque(eleEstatica);
        p5.agregarAtaque(granEncanto);
        p5.agregarAtaque(tenacidad);
        p6.agregarAtaque(humedad);
        p6.agregarAtaque(aclimatacion);

        System.out.println("Comienza la pelea");

        do {
            if(p3.getVida()<=0){
                break;
            }
            p3.atacar(p4);
            if(p4.getVida()<=0){
                break;
            }
            p4.atacar(p3);
            System.out.println("p4 = " + p4);
            System.out.println("p3 = " + p3);
        }while(true);

        System.out.println("p4 = " + p4);
        System.out.println("p3 = " + p3);
        System.out.println("Fin de la pelea");












    }
}
