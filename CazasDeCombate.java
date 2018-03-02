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
    private String creador;
    // Potencia del caza de combate
    private int potencia;
    // Velocidad Maxima del caza de combate
    private int maxVelocidad;
    // Funcion que desempeñan
    private String tipo;
    // Identificador unico [pide commit 1]
    private int id;
    /**
     * Constructor CazasDeCombate
     */
    public CazasDeCombate(String marca, String modelo, String creador, int potencia, int maxVelocidad, String tipo, int id)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.creador = creador;
        potencia = potencia;
        maxVelocidad = maxVelocidad;
        this.tipo = tipo;
        id = id;
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
     *
     * @param  creador del caza
     * @return  nombre del creador del caza
     */
    
    public String getCreador()
    {
        return marca;
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
     * @param  velocidad del caza
     * @return  velocidad maxima del caza
     */
    
    public int getmaxVelocidad()
    {
        return maxVelocidad;
    }  
    
    /**
     *
     * @param  funcion del caza
     * @return  funcion del caza
     */
    
    public String getTipo()
    {
        return tipo;
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
    
    public void setModelo(String setModelo)
    {
        this.modelo = modelo;
    } 
    
    /**
     *
     * @param setCreador - Nombre del creador del caza
     */
    
    public void setCreador(String setCreador)
    {
        this.creador = creador;
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
     *
     * @param setMaxvelocidad - Velocidad maxima del caza
     */
    
    public void setMaxvelocidad (int setMaxvelocidad)
    {
        this.maxVelocidad = maxVelocidad;
    } 
    
    /**
     *
     * @param setTipo - Funcion que ejerce el caza
     */
    
    public void setTipo (String setTipo)
    {
        this.tipo = tipo;
    } 
    
     /**
     *
     * @param  setId - Identificador del caza
    */
    
    public void setId(int setId)
    {
        this.id = id;
    } 
}
