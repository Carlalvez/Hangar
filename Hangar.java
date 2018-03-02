import java.util.ArrayList;
/**
 * Almacén de cazas de combate en el "Hangar"
 *
 * @author (Carlos Alvarez)
 * @version (02/03/2018)
 */
public class Hangar
{
    // ID que queda reflejado en la clase cazas.
    private int id;
    // Coleccion de cazas de combate
    private ArrayList <CazasDeCombate> cazas;
    /**
     * Constructor for objects of class Hangar
     */
    public Hangar(int id)
    {
        // Definido parametro ID.
        id = 1;   
        cazas = new ArrayList<>();
    }

    /**
     * 
     * @param  Añade cazas de combate al hangar
     * 
     */
    public void addCaza (String marca, String modelo, String creador, int potencia, int maxVelocidad, String tipo)
    {
        // Agrega cazas al hangar
        cazas.add(new CazasDeCombate(marca, modelo, creador, potencia, maxVelocidad, tipo,id));
        id++;
    }
}