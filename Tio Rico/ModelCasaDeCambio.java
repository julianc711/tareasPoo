/**
 * Un ejemplo que modela una Casa de Cambio de Bolívares usando POO
 * 
 * @author (Anderson Orozco)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 * History: Abril 2008 / Marzo 2018
 */
public class ModelCasaDeCambio 
{
    float precioDeCompra;
    float precioDeVenta;
    int bolivaresComprados;
    int bolivaresVendidos;
    float bolivaresEnCaja;
    float pesosEnCaja;
    float ganancias;
    
    /**
     * Default constructor
     */
    public ModelCasaDeCambio() 
    {
        
    }
    
    public float getPrecioDeCompra() 
    {
        return precioDeCompra;
    }
    
    public void setPrecioDeCompra(float precioDeCompra)
    {
        this.precioDeCompra = precioDeCompra;
    }
    
    public float getPrecioDeVenta() 
    {
        return precioDeVenta;
    }
    
    public void setPrecioDeVenta(float precioDeVenta)
    {
        this.precioDeVenta = precioDeVenta;
    }
    
    public int getBolivaresComprados() 
    {
        return bolivaresComprados;
    }
    
    public void setBolivaresComprados(int bolivaresComprados)
    {
        this.bolivaresComprados = bolivaresComprados;
    }
    
    public int getBolivaresVendidos() 
    {
        return bolivaresVendidos;
    }
    
    public void setBolivaresVendidos(int bolivaresVendidos)
    {
        this.bolivaresVendidos = bolivaresVendidos;
    }
    
    public float getBolivaresEnCaja() 
    {
        return bolivaresEnCaja;
    }
    
    public void setBolivaresEnCaja(float bolivaresEnCaja)
    {
        this.bolivaresEnCaja = bolivaresEnCaja;
    }
    
    public float getPesosEnCaja() 
    {
        return pesosEnCaja;
    }
    
    public void setPesosEnCaja(float pesosEnCaja)
    {
        this.pesosEnCaja = pesosEnCaja;
    }
    
     /**
     * Calcula la ganancia de comprar un bolivar, es decir, la diferencia entre los previos de compra y venta...
     */
    public float getGananciaEnUnBolivar() 
    {
        float gananciaEnUnBolivar= this.precioDeVenta-this.precioDeCompra;
        return gananciaEnUnBolivar;
    }
    
    /**
     * Es similar a los metodos SET, pero en este caso cambia al tiempo los dos precios...por eso no hay SET
     * Debe controlar que el precio no sea cero ni negativo y que los precios generen ganancias...
     * @param precioDeCompra
     * @param precioDeVenta
     * @return regresa true cuando pudo cambiar ambos precios, en caso contrario falla.
     */   
    public boolean cambiarPrecioDelBolivar(float precioDeCompra, float precioDeVenta) 
    {
        boolean precioValido = false;
           
        if(precioDeCompra>0 && precioDeCompra>0 && precioDeVenta-precioDeCompra>0)
        {
            this.precioDeCompra=precioDeCompra;
            this.precioDeVenta=precioDeVenta;
            precioValido = true;
        }
        return precioValido;
    }//fin cambiarPrecioDelBolivar 
    
    /**
     * Registra la compra de bolivares
     * @param cantidad La cantidad de bolivares a comprar
     * @return true si pudo comprar
     */
    public boolean comprarBolivares(int cantidad) 
    {
        boolean puedeComprar, suficientesBolivares;
        
        puedeComprar=(cantidad>0 && (cantidad*this.precioDeCompra)<=this.pesosEnCaja);
        suficientesBolivares=bolivaresEnCaja>=cantidad;
        
        if(puedeComprar && suficientesBolivares)
        {
            this.bolivaresComprados+=cantidad;
            this.pesosEnCaja-=cantidad*precioDeCompra;
            this.bolivaresEnCaja+=cantidad;
        }
        return puedeComprar;
    }//fin comprarBolivares
    
    /**
     * 
     * @param cantidad
     * @return
     */
    public boolean venderBolivares(int cantidad) 
    {
        boolean puedeVender = false;
        
        if(bolivaresEnCaja>=cantidad)
        {
            bolivaresEnCaja=bolivaresEnCaja-cantidad;
            bolivaresVendidos=bolivaresVendidos+cantidad;
            pesosEnCaja=pesosEnCaja+cantidad*precioDeVenta;
            ganancias += cantidad*getGananciaEnUnBolivar();
            puedeVender=true;
        }
        return puedeVender;
    }//fin venderBolivares
    
    /**
     * Calcula y regresa los impuestos, aunque no exista una propiedad llamada impuestos, no se necesita...
     * @return los impuestos, el 16% de los bolivares vendidos, convirtiendo a pesos
     */
    public float getImpuestos() 
    {
        return ganancias*16/100;
    }//fin getImpuestos
    
    /**
     * Calcula y regresa las ganancias, aunque no exista una propiedad llamada ganancias, no se necesita...
     * @return las ganancias, que corresponden al dinero en pesos en caja menos los impuestos
     */
    public float getGanancias() 
    {
       return ganancias-getImpuestos();
    }//fin getGanancias
    
    /**
     * Aumenta la cantidad de pesos en caja, inyecta dinero al negocio
     * @param cantidad Debe validarse que la cantidad no sea  negativa...
     */
    public void inyectarPesos(int cantidad) 
    {
        if(cantidad>0)
        this.pesosEnCaja=this.pesosEnCaja+cantidad;
    }//fin inyectarPesos
    
    /**
     * Lo mismo que el anterior, pero con bolivares...
     * @param cantidad
     */
    public void inyectarBolivares(int cantidad) 
    {
         if(cantidad>0)
         this.bolivaresEnCaja=this.bolivaresEnCaja+cantidad;
    }

}//End class