/**
 * Un sencillo ejercicio geométrico con un único objeto Rectangulo.
 * @author Anderson Orozco 
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
class Rectangulo 
{

    /**Coordenada x del punto correspondiente a la esquina superior izquierda del Rectangulo*/
    protected float origenX=Float.POSITIVE_INFINITY;
    /**Coordenada y del punto correspondiente a la esquina superior izquierda del Rectangulo*/
    protected float origenY=Float.POSITIVE_INFINITY;
    /**Ancho del Rectangulo*/
    protected float ancho=Float.POSITIVE_INFINITY;
    /**Alto del Rectangulo*/
    protected float alto=Float.POSITIVE_INFINITY;

    /**
     * Constructor default
     */
    public Rectangulo()
    {
        origenX = 0;
        origenY = 0;
        ancho = 0;
        alto = 0;
    }

    /**
     * Constructor con parámetros
     * @x el valor inicial para origenX
     * @y el valor inicial para origenY
     * @w el valor inicial para el ancho
     * @h el valor inicial para el alto
     */
    public Rectangulo(float x, float y, float w, float h)
    {
        this.origenX = x;
        this.origenY = y;
        this.ancho = w;
        this.alto = h;
    }

    /**
     * Determina la ubicación de unpunto con coordenadas x, y respecto al Rectangulo.
     * Las posibles salidas son:
     * "Punto Dentro del Rectángulo"
     * "Punto En Borde Superior"
     * "Punto en Borde Inferior"
     * "Punto en Borde Izquierdo"
     * "Punto en Borde Derecho"
     * "Punto Fuera del Rectángulo"
     * 
     * @param x coordenada x del punto para el cual se requiere determinar la ubicación
     * @param y coordenada y del punto para el cual se requiere determinar la ubicación
     * @return Un String indicando la ubicacion
     */
    public String getPosicionPunto(float x, float y) 
    {
        String ubicacion = "Ubicación Desconocida";
        
        if((x > origenX) && (x < origenX+ancho) && (y < origenY) && (y > origenY-ancho))
        {
            ubicacion = "Punto Dentro del Rectángulo";
        }
        
        else if((x > origenX) && (x < origenX+ancho) && (y == origenY))
        {
            ubicacion = "Punto En Borde Superior";
        }
        
        else if ((x > origenX) && (x < origenX+ancho) && (y == origenY-alto))
        {
            ubicacion = "Punto en Borde Inferior";
        }
        
        else if((y < origenY) && (y > origenY-alto) && (x == origenX))
        {
            ubicacion = "Punto en Borde Izquierdo";
        }
        else if((x == origenX+ancho) && (y < origenY) && (y > origenY-alto))
        {
            ubicacion = "Punto en Borde Derecho";
        }
        else if((x < origenX) || (x > origenX+ancho) || (y > origenY) || (y < origenY-alto))
        {
            ubicacion = "Punto Fuera del Rectángulo";
        }
        return ubicacion;
    }//fin método getPosiciónPunto

    /**
     * Determina si un punto de coordenadas x,y se encuentran dentro de este Rectangulo
     * @param x coordenada x del punto para el cual se requiere determinar si está dentro del Rectanculo
     * @param y coordenada y del punto para el cual se requiere determinar si está dentro del Rectanculo
     * @return false  o true según corresponda
     */
    public boolean puntoEstaDentro(float x, float y) 
    {
        if((x > origenX) && (x < origenX+ancho) && (y < origenY) && (y > origenY-ancho))
        {
            return true;
        }
        else return false;
    }//fin método puntoEstaDentro 

    /**
     * Determina si un punto de coordenadas x,y se encuentran en el Borde Superior de este Rectangulo
     * @param x coordenada x del punto para el cual se requiere determinar si está en el Borde Superior del Rectanculo
     * @param y coordenada y del punto para el cual se requiere determinar si está en el Borde Superior del Rectanculo
     * @return false  o true según corresponda
     */
    public boolean puntoEstaEnBordeSuperior(float x, float y) 
    {
        if((x > origenX) && (x < origenX+ancho) && (y == origenY))
        {
            return true;
        }
        else return false;
    }//fin puntoEstaEnBordeSuperior

    /**
     * Determina si un punto de coordenadas x,y se encuentran en el Borde Inferior de este Rectangulo
     * @param x coordenada x del punto para el cual se requiere determinar si está en el Borde Inferior del Rectanculo
     * @param y coordenada y del punto para el cual se requiere determinar si está en el Borde Inferior del Rectanculo
     * @return false  o true según corresponda
     */
    public boolean puntoEstaEnBordeInferior(float x, float y) 
    {
        if((x > origenX) && (x < origenX+ancho) && (y == origenY-alto))
        {
            return true;
        }
        else return false;
    }//fin puntoEstaEnBordeInferior

    /**
     * Determina si un punto de coordenadas x,y se encuentran en el Borde Izquierdo de este Rectangulo
     * @param x coordenada x del punto para el cual se requiere determinar si está en el Borde Izquierdo  del Rectanculo
     * @param y coordenada y del punto para el cual se requiere determinar si está en el Borde Izquierdo  del Rectanculo
     * @return false  o true según corresponda
     */
    public boolean puntoEstaEnBordeIzquierdo(float x, float y) 
    {
        if((y < origenY) && (y > origenY-alto) && (x == origenX))
        {
            return true;
        }
        else return false;
    }//fin puntoEstaEnBordeIzquierdo

    /**
     * Determina si un punto de coordenadas x,y se encuentran en el Borde Derecho de este Rectangulo
     * @param x coordenada x del punto para el cual se requiere determinar si está en el Borde Derecho del Rectanculo
     * @param y coordenada y del punto para el cual se requiere determinar si está en el Borde Derecho del Rectanculo
     * @return false  o true según corresponda
     */
    public boolean puntoEstaEnBordeDerecho(float x, float y) 
    {
        if((x == origenX+ancho) && (y < origenY) && (y > origenY-alto))
        {
            return true;
        }
        else return false;
    }//fin puntoEstaEnBordeDerecho

    /**
     * Determina si un punto de coordenadas x,y se encuentran fuera de este Rectangulo
     * @param x coordenada x del punto para el cual se requiere determinar si estáfuera del Rectanculo
     * @param y coordenada y del punto para el cual se requiere determinar si fuera del Rectanculo
     * @return false  o true según corresponda
     */
    public boolean puntoEstaFuera(float x, float y) 
    {
        if((x < origenX) || (x > origenX+ancho) || (y > origenY) || (y < origenY-alto))
        {
            return true;
        }
        else return false;
    }//fin puntoEstaFuera

    /**Metodo de acceso a la propiedad origenX*/
    public float getOrigenX()
    {
        return this.origenX;
    }//end method getOrigenX

    /**Metodo de modificación a la propiedad origenX*/
    public void setOrigenX(float newOrigenX)
    {
        this.origenX = newOrigenX;
    }//end method setOrigenX

    /**Metodo de acceso a la propiedad origenY*/
    public float getOrigenY()
    {
        return this.origenY;
    }//end method getOrigenY

    /**Metodo de modificación a la propiedad origenY*/
    public void setOrigenY(float origenY)
    {
        this.origenY = origenY;
    }//end method setOrigenY

    /**Metodo de acceso a la propiedad ancho*/
    public float getAncho()
    {
        return ancho;
    }//end method getAncho

    /**Metodo de modificación a la propiedad ancho*/
    public void setAncho(float ancho)
    {
        this.ancho = ancho;
    }//end method setAncho

    /**Metodo de acceso a la propiedad alto*/
    public float getAlto()
    {
        return alto;
    }//end method getAlto

    /**Metodo de modificación a la propiedad alto*/
    public void setAlto(float alto)
    {
        this.alto = alto;
    }//end method setAlto

}//fin clase Rectangulo