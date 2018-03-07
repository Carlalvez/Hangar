import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Iterator;
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
    public Hangar()
    {
        // Definido parametro ID.
        id = 1;   
        cazas = new ArrayList<CazasDeCombate>();
    }

    /**
     * 
     * @param  Añade cazas de combate al hangar
     * 
     */
    public void addCaza (String marca, String modelo, int potencia, int ano,int mes, int dia)
    {
       // Agrega cazas al hangar
       CazasDeCombate nuevoCaza = new CazasDeCombate (marca, modelo, potencia, ano, mes, dia, id);
       cazas.add(nuevoCaza);
       id++;
    }
    
    public void mostrarCazasPorId ()
    {
        int contador = 0;
        
        while (contador < cazas.size()){
         System.out.println (cazas.get(contador).getInfo());
         contador++;
        }
    }
    
    public void mostrarPorPotencia(){
        if(cazas.size()>0) {
            cazas.addAll(cazas);
            CazasDeCombate cazaMasPotencia = cazas.get(0);
            for(int i = 0 ; i<cazas.size() ; i++){
                
                int posPrimera = 0;
                int posicion = 0;
                
                for(int cont=0;cont < cazas.size();
                
                cont++)
                {
                    if(cazas.get(cont).getPotencia() >= posPrimera){
                        cazaMasPotencia = cazas.get(cont);
                        posPrimera = cazas.get(cont).getPotencia();
                        posicion = cont;
                    }
                }
                System.out.println(cazaMasPotencia.getInfo());
                cazas.remove(posicion);
            }
        }
    }
    
    public void mostrarPorFecha(){
         if(cazas.size()>0) {
             ArrayList<CazasDeCombate> caza = new ArrayList<>();
             cazas.addAll(cazas);
             CazasDeCombate cazaMasAntiguo = cazas.get(0);
             for(int i = 0 ;i<cazas.size();i++){
                 LocalDate fecha = LocalDate.of(9999,12,31) ;
                 int posicion = 0;
                 for(int cont=0;cont < cazas.size();cont++){
                     if(cazas.get(cont).getFechaFabricacion().isBefore(fecha)){
                         cazaMasAntiguo = cazas.get(cont);
                         fecha = cazas.get(cont).getFechaFabricacion();
                         posicion = cont;
                     }
                 }
                 System.out.println(cazaMasAntiguo.getInfo());
                 cazas.remove(posicion);
             }
         }
     }
     
    /**
     * Permite modificar la potencia de un caza
     */
    public void modificarPotencia(int idCaza, int nuevaPotencia){
        if(cazas.size()>= id && id >= 0){
            CazasDeCombate cambioDePotencia = cazas.get(id - 1);
            cambioDePotencia.setPotencia (nuevaPotencia);
        }
    }
}