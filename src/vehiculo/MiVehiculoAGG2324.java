
package vehiculo;

/**
 *@version 1.0
 * @author Alberto Gálvez Gómez
 * @since 28/04/2024
 */
public class MiVehiculoAGG2324 {

    protected String nombre;
    protected double precio;
    protected double precioIVA;
    protected int stock;

    /* Constructor sin argumentos */
    public MiVehiculoAGG2324 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    
    /**
     * Constructor con parámetros
     * @param nom nombre del vehículo
     * @param precio precio del vehículo
     * @param stock cantidad de stock del vehículo
     */
    public MiVehiculoAGG2324 (String nom, double precio, int stock)
    {
        this.nombre =nom;
        this.precio=precio;
        this.stock=stock;
    }
   
    /**
     * Método de acceso al atributo nombre
     * @param nom 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Método de selección del atributo nombre
     * @return 
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método de selección del atributo stock
     * @return 
     */
     public int obtenerStock ()
    {
        return getStock();
    }

    /**
     * Método para comprar
     * @param cantidad cantidad de coches a comprar
     * @throws Exception 
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de vehiculos");
        setStock(getStock() + cantidad);
    }

    /**
     * Método para vender vehículo
     * @param cantidad cantidad de vehículos a vender
     * @throws Exception 
     */
    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de vehiculos");
        if (obtenerStock()< cantidad)
            throw new Exception ("No se hay suficientes vehiculos para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * Método para seleccionar el atributo nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método de acceso al atributo nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método de selección del atributo precio
     * @return 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método de acceso al atributo precio
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método de selección al atributo precioIVA
     * @return 
     */
    public double getPrecioIVA() {
        return precioIVA;
    }

    /**
     * Método de acceso al atributo precioIVA
     * @param precioIVA
     */
    public void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    /**
     * Método de selección al atributo stock
     * @return 
     */
    public int getStock() {
        return stock;
    }

    /**
     * Método de acceso al atributo stock
     * @param stock 
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}  
   
    

