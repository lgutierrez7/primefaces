/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import entidad.Jugadores;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Luis
 */
public class CargaJugadores {

    private List<Jugadores> listaJugadores;
    private String[] nombres;
    private String[] apellidos;
    private String[] posiciones;
    private String[] nacionalidades;

    public CargaJugadores() {

        nombres = new String[4];
        nombres[0] = "abidal";
        nombres[1] = "messi";
        nombres[2] = "puyol";
        nombres[3] = "valdes";


        apellidos = new String[4];
        apellidos[0] = "Gutierrez";
        apellidos[1] = "Silva";
        apellidos[2] = "Malpartida";
        apellidos[3] = "Osorio";

        posiciones = new String[4];
        posiciones[0] = "Delantero";
        posiciones[1] = "Defensa";
        posiciones[2] = "Volante";
        posiciones[3] = "Arquero";


        nacionalidades = new String[4];
        nacionalidades[0] = "Peruana";
        nacionalidades[1] = "Argentia";
        nacionalidades[2] = "Colombiana";
        nacionalidades[3] = "Brasileña";
        
         listaJugadores = new ArrayList<Jugadores>();
        for (int i = 1; i <= 50; i++) {
            listaJugadores.add(new Jugadores(i, obtenerNombre(),
                    obtenerApellido(), new Date(), obtenerPosicion(), obtenerNacionalidad()));
        }
    }

    public List<Jugadores> obtenerJugadores() {
       
        return listaJugadores;
    }

    public String obtenerNombre() {
        Random rand = new Random();
        int n = rand.nextInt(4);
        return nombres[n];
    }

    public String obtenerApellido() {
        Random rand = new Random();
        int n = rand.nextInt(4);
        return apellidos[n];
    }

    public String obtenerNacionalidad() {
        Random rand = new Random();
        int n = rand.nextInt(4);
        return nacionalidades[n];
    }

    public String obtenerPosicion() {
        Random rand = new Random();
        int n = rand.nextInt(4);
        return posiciones[n];
    }
}
