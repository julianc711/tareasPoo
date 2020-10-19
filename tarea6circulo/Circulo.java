/**
 * Un ejemplo que modela un Circulo usando POO
 * 
 * @author (Gerson Israel Diaz de la Garza - gersonisraeldide@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Circulo 
{

    //COMPLETE las tres propiedades mínimas de un Circulo
    protected float centroX;
    protected float centroY;
    protected float radio;
    protected float x;
    protected float y;

    public Circulo() 
    {
        
    }

    public Circulo(float centroX, float centroY, float radio) 
    {
        this.centroX = centroX;
        this.centroY = centroY;
        this.radio = radio;
    }
    /**
     * 
     * @param x coordenada x del punto
     * @param y coordenada y del punto
     * @return
     */
    
    public String getPosicionPunto(float x, float y) 
    {
        String ubicacion = "Ubicación Desconocida";

        if (puntoEstaDentro(x,y)) 
        {
            ubicacion = "Punto Dentro del Círculo";
            
        } else if (puntoEstaEnBorde(x,y)) 
        {
            ubicacion = "Punto En Borde de Círculo";
            
        } else if (puntoEstaFuera(x,y))
        {
            ubicacion = "Punto Fuera del Círculo";
        }

        return ubicacion;
    }//fin método getPosiciónPunto
    
    public boolean puntoEstaDentro(float x, float y) {
        double distancia = Math.sqrt(Math.pow((x-getCentroX()),2)+Math.pow((y-getCentroY()),2));
        
        if (distancia < getRadio())
        {
            return true;
            
        } else return false;
    }//fin método puntoEstaDentro 
    
    public boolean puntoEstaFuera(float x, float y) 
    {
        double distancia = Math.sqrt(Math.pow( (x-getCentroX()),2 ) + Math.pow( (y-getCentroY()),2) );
        
        if (distancia > getRadio())
        {
            return true;
            
        } else return false;
    }//fin método puntoEstaFuera
    
    public boolean puntoEstaEnBorde(float x, float y) 
    {
        double distancia = Math.sqrt(Math.pow((x-getCentroX()),2)+Math.pow((y-getCentroY()),2));
        if (distancia == getRadio())
        {
            return true;
            
        } else return false;
    }//fin puntoEstaEnBordeSuperior
    
    /*Getter method origenX*/
    public float getCentroX()
    {
        return this.centroX;
    }//end method getOrigenX

    /*Setter method origenX*/
    public void setCentroX(float centroX)
    {
        this.centroX = centroX;
    }//end method setOrigenX

    /*Getter method origenY*/
    public float getCentroY()
    {
        return this.centroY;
    }//end method getOrigenY

    /*Setter method origenY*/
    public void setCentroY(float centroY)
    {
        this.centroY = centroY;
    }//end method setOrigenY

    /*Getter method radio*/
    public float getRadio()
    {
        return this.radio;
    }//end method getRadio

    /*Setter method radio*/
    public void setRadio(float radio)
    {
        this.radio = radio;
    }//end method setRadio

    //Start GetterSetterExtension Source Code
    /**GET Method Propertie x*/
    public float getX(){
        return this.x;
    }//end method getX

    /**SET Method Propertie x*/
    public void setX(float x){
        this.x = x;
    }//end method setX

    /**GET Method Propertie y*/
    public float getY(){
        return this.y;
    }//end method getY

    /**SET Method Propertie y*/
    public void setY(float y){
        this.y = y;
    }//end method setY

    //End GetterSetterExtension Source Code
//!
}//End class 