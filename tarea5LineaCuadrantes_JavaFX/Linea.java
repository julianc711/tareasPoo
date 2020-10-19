     /**
 * Un ejemplo que modela un Linea usando POO
 * 
 * @author (Gerson Israel Diaz de la Garza - gersonisraeldide@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Linea 
{
    float x1;
    float x2;
    float y1;
    float y2;
    
    public Linea() 
    {
        
    }
    
    public Linea(float x1, float y1, float x2, float y2) 
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /*complete GET/SET*/

    public String getUbicacion() 
    {
        String ubicacion = "Error, es imposible";
        
        if(estaEnCuadranteI())
        {
            ubicacion="Esta en cuadrante I";
            if(estaEnCuadranteII())
            {
                ubicacion="Esta en el cuadrante I y II.";
                
                if(estaEnCuadranteIII())
                {
                    ubicacion="Esta en el cuadrante I,II y III.";
                    
                } else if(estaEnCuadranteIV() && getIntersectoY() > 0)
                  {
                      ubicacion="Esta en el cuadrante I,II y IV.";
                  }
            }
            else if(estaEnCuadranteIII())
            {
                ubicacion="Esta en el cuadrante I y III.";
                
                if (estaEnCuadranteIV())
                {
                    ubicacion="Esta en el cuadrante I, III y IV.";
                }
            }
            else if(estaEnCuadranteIV()) ubicacion="Esta en el cuadrante I y IV.";
        }
        else if(estaEnCuadranteII())
        {
            ubicacion="Esta en cuadrante II.";
            
            if(estaEnCuadranteIII())
            {
                ubicacion="Esta en cuadrante II y III";
                if(estaEnCuadranteIV()) ubicacion="Esta en el cuadrante II, III y IV.";
            }
            else if(estaEnCuadranteIV()) ubicacion="Esta en el cuadrante II y IV.";
        }
        else if(estaEnCuadranteIII())
        {
            ubicacion="Esta en el cuadrante III";
            if(estaEnCuadranteIV()) ubicacion="Esta en cuadrante III y IV.";
        }
        else if(estaEnCuadranteIV())
        {
            ubicacion="Esta en el cuadrante IV";
        }
        return ubicacion;
    }//fin getUbicacion
    
    public int getCuantosCuadrantes() 
    {
        return 4;
    }//fin getCuantosCuadrantes
    
    public boolean estaEnCuadranteI() 
    {
        getIntersectoY();
        
        if((getX1() > 0 && getY1() > 0) || (getX2() > 0 && getY2() > 0))
        {
            return true;
        }
        else if(getX1() > 0 && getY1() > 0 && getX2() > 0 && getY2() > 0)
        {
            return true;
        }
        else if(estaEnCuadranteII() && estaEnCuadranteIV() && getIntersectoY() > 0)
        {
            return true;
        }
        else return false;
        
    }//fin estaEnCuadranteI
    
    public boolean estaEnCuadranteII() 
    {
        getIntersectoY();
        
        if ((getX1() < 0 && getY1() > 0) || (getX2() < 0 && getY2() > 0))
        {
            return true;
        }
        else if (getX1() < 0 && getY1() > 0 && getX2() < 0 && getY2() > 0)
        {
            return true;
        }
        else if (estaEnCuadranteI() && estaEnCuadranteIII() && getIntersectoY() > 0)
        {
            return true;
        }
        else return false;

    }//fin estaEnPrimerCuadranteII
    
    public boolean estaEnCuadranteIII() 
    {
        getIntersectoY();
        
        if((getX1() < 0 && getY1() < 0) || (getX2() < 0 && getY2() < 0))
        {
            return true;
        }
        else if((getX1() < 0 && getY1() < 0) || (getX2() < 0 && getY2() < 0))
        {
            return true;
        }
        else if(estaEnCuadranteII() && estaEnCuadranteIV() && getIntersectoY() < 0)
        {
            return true;
        }
        else return false;
        
    }//fin estaEnCuadranteIII
    
    public boolean estaEnCuadranteIV() 
    {
        getIntersectoY();
        
        if((getX1() > 0 && getY1() < 0) || (getX2() > 0 && getY2() < 0))
        {
            return true;
        }
        else if(estaEnCuadranteI() && estaEnCuadranteIII() && getIntersectoY() < 0)
        {
            return true;
        }
        else return false;

    }//fin estaEnCuadranteIV
    
    public float getPendiente() 
    {
        return ((y2 - y1) / (x2 - x1));
    }

    public float getIntersectoY() 
    {
        return ((-x1*(getPendiente())+(y1)));
    }

    /**Getter method x1*/
    public float getX1()
    {
        return this.x1;
    }//end method getX1

    /**Setter method x1*/
    public void setX1(float x1)
    {
        this.x1 = x1;
    }//end method setX1

    /**Getter method x2*/
    public float getX2()
    {
        return this.x2;
    }//end method getX2

    /**Setter method x2*/
    public void setX2(float x2)
    {
        this.x2 = x2;
    }//end method setX2

    /**Getter method y1*/
    public float getY1()
    {
        return this.y1;
    }//end method getY1

    /**Setter method y1*/
    public void setY1(float y1)
    {
        this.y1 = y1;
    }//end method setY1

    /**Getter method y2*/
    public float getY2()
    {
        return this.y2;
    }//end method getY2

    /**Setter method y2*/
    public void setY2(float y2)
    {
        this.y2 = y2;
    }//end method setY2

    //End GetterSetterExtension Code
}//End class !

