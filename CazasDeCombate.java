import java.time.LocalDate;
/**
 *
 * @autor (Carlos Alvarez)
 * @version (02/03/2018)
 */
public class CazasDeCombate
{
    // Marca del caza de combate
    private String marca;
    // Modelo del caza de combate
    private String modelo;
    // Diseñador del caza de combate
    private int potencia;
    // Identificador unico [pide commit 1]
    private int id;
    // Fecha de produccion moto
    private LocalDate fechaFabricacion;
    /**
     * Constructor CazasDeCombate
     */
    public CazasDeCombate(String marca, String modelo, int potencia, int identificador, int ano,int mes, int dia)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        fechaFabricacion = LocalDate.of(ano,mes,dia);
        id = identificador;
    }
    
    // METODOS GETTERS //
    
    /**
     *
     * @param  marca del caza
     * @return  nombre de la marca del caza
     */
    
    public String getMarca()
    {
        return marca;
    }   
    
    /**
     *
     * @param  modelo del caza
     * @return  modelo del caza
     */
    
    public String getModelo()
    {
        return modelo;
    }  
    /**
    * Devuelve la fecha de fabricacion del caza.
    */
     public LocalDate getFechaFabricacion(){
         return fechaFabricacion;
     }
    
    /**
     *
     * @param  potencia del caza
     * @return  potencia del caza
     */
    
    public int getPotencia()
    {
        return potencia;
    }  
    
      /**
     *
     * @param  Identificador del caza
     * @return  Numero indentificador del caza
     */
    
    public int getId()
    {
        return id;
    } 
    
    // METODOS SETTERS //
    
    /**
     *
     * @param  setMarca - Marca del caza
     */
    
    public void setMarca(String setMarca)
    {
        this.marca = marca;
    } 
    
    /**
     *
     * @param  setModelo - Modelo del caza
     */
    
    public void setModelo (String setModelo)
    {
        this.modelo = modelo;
    } 
    
    /**
     *
     * @param setPotencia - Potencia del caza
     */
    
    public void setPotencia (int setPotencia)
    {
        this.potencia = potencia;
    } 
    
    /**
      * Permite modificar la fecha de produccion de la moto.
      */
    public void setFechaProduccion(int ano,int mes, int dia){
        fechaFabricacion = LocalDate.of(ano,mes,dia);
        
     }
        
     /**
     *
     * @param  setId - Identificador del caza
    */
    
    public void setId (int setId)
    {
        this.id = id;
    } 
    
    /**
     * @return Devuelve toda la informacion sobre un caza de combate.
     */
    public String getInfo() {
        String datos ="Identificador : #" + id + " - marca: " + marca + " - modelo: " + modelo + " - potencia: " + potencia;
        return datos;
    }
}