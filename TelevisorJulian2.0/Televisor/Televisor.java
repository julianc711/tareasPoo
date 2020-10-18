
/**
 * Un ejemplo que modela un Televisor simple usando POO
 * 
 * @author (Julian Riveros-juliancamilorifo@ufps.edu.co)
 * 
 */
public class Televisor
{
    /**
     * Tipo de entrada
     *   0 = Apagado
     *   1 = Antena (maximo 13 canales)
     *   2 = Cable (el maximo de canales es 100)
     *   3 = Auxiliar (DVD, VH, etc), un canal
     **/
    protected int tipoDeEntrada;

    /**Volumen del televisor*/
    protected int volumen;

    /**
     * Canal sintonizado, si la entrada es auxiliar, el canal es el 1, 2 � 3
     **/
    protected int canal;

    /**Constante maximo volumen*/
    public static final int maximoVolumen = 20;

    /**Constante tipo de entarda apagado*/
    public static final int apagado = 0;

    /**Constante tipo de entarda antena*/
    public static final int antena = 1;

    /**Constante tipo de entarda cable*/
    public static final int cable = 2;

    /**Constante tipo de entarda auxiliar*/
    public static final int auxiliar = 3;

    /**Arreglo constante con nombres de cada entrada*/
    public static final String [] tiposDeEntrada = {"Apagado", "Antena", "Cable", "Auxiliar"};

    /**Constructor que inicializa con valores por defecto*/
    public Televisor()
    {
        volumen=0;
        canal=0;
        tipoDeEntrada=0; 
    }

    /***
     * Construye un televisor inicializando sus propiedades con los par�metros recibidos
     * @param    tipoDeEntrada valor inicial de la propiedad tipoDeEntrada
     * @param    volumen valor inicial de la propiedad volumen
     * @param    canal valor inicial de la propiedad canal
     */
    public Televisor(int tipoDeEntrada, int volumen,int canal)
    {
        this.tipoDeEntrada=tipoDeEntrada;
        this.canal=canal;
        this.volumen=volumen;
    }

    /***
     * Sube el volumen del televisor
     * @return  true si pudo subirlo, false si lleg� al m�ximo
     */
    public boolean subirVolumen()
    {
        boolean sePuedeSubir = false;
        if(volumen<maximoVolumen){
            volumen++;
            sePuedeSubir= true;
        }
        return sePuedeSubir;
    }

    /***
     * Baja el volumen del televisor
     * @return  true si pudo bajar, false si lleg� al m�nimo (0)
     */
    public boolean bajarVolumen()
    {
        boolean sePuedeBajar = false;
        if(volumen>0){
            volumen--;
            sePuedeBajar = true;
        }
        return sePuedeBajar;
    }

    /***
     * Avanza el canal del televisor, si llega al m�ximo regresa al m�nimo
     */
    public void avanzarCanal()
    {
        if(tipoDeEntrada==apagado)
            canal = 1;

        if(tipoDeEntrada==antena && canal>0 && canal<13)
            canal++; 
        else if(tipoDeEntrada==antena && canal==13)
            canal=1;

        if(tipoDeEntrada==cable && canal>0 && canal<100)
            canal++; 
        else if(tipoDeEntrada==cable && canal==100)
            canal=1;

        if(tipoDeEntrada==auxiliar && canal>0 && canal<3)
            canal++; 
        else if(tipoDeEntrada==auxiliar && canal==3)
            canal=1;
    }

    /***
     * Retrocede el canal del televisor, si llega al m�nimo pasa al m�ximo
     */
    public void retrocederCanal()
    {
        if(tipoDeEntrada==antena && canal>1 && canal<14)
            canal--; 
        else if(tipoDeEntrada==antena && canal==1)
            canal=13;

        if(tipoDeEntrada==cable && canal>1 && canal<101)
            canal--; 
        else if(tipoDeEntrada==cable && canal==1) 
            canal=100;

        if(tipoDeEntrada==auxiliar && canal>1 && canal<4)
            canal--; 
        else if(tipoDeEntrada==auxiliar && canal==1)
            canal=3;
    }     

    /**
     * M�todo de acceso al canal m�ximo seg�n la entrada
     * @return el valor del m�ximo canal
     */
    public int getMaximoCanal()
    {
        int maximoCanal= 0;
        if(tipoDeEntrada==antena)
            maximoCanal=13;
        else if(tipoDeEntrada==cable)
            maximoCanal=100;
        else if(tipoDeEntrada==auxiliar)
            maximoCanal=3;

        return maximoCanal;
    }

    /**
     * M�todo de acceso a la propiedad volumen
     * @return el valor de volumen para �ste objeto Televisor
     */
    public int getVolumen()
    {
        return this.volumen;
    }

    /***
     * M�todo para modificaci�n de la propiedad volumen
     * @param   volumen el nuevo valor de la propiedad volumen
     */
    public void setVolumen(int volumen)
    {
        this.volumen = volumen;
    } 

    /**
     * M�todo de acceso a la propiedad canal
     * @return el valor de canal para �ste objeto Televisor
     */
    public int getCanal()
    {
        return this.canal;
    }

    /***
     * M�todo para modificaci�n de la propiedad canal
     * @param   canal el nuevo valor de la propiedad canal
     */
    public void setCanal(int canal)
    {
        this.canal = canal;
    }//fin setCanal

    /**
     * M�todo de acceso a la propiedad tipoDeEntrada
     * @return el valor de tipoDeEntrada para �ste objeto Televisor
     */
    public String getTipoDeEntrada()
    {
        String rta = null;

        if(tipoDeEntrada==apagado)
            rta=tiposDeEntrada[0];
        else if(tipoDeEntrada==antena)
            rta=tiposDeEntrada[1];
        else if(tipoDeEntrada==cable)
            rta=tiposDeEntrada[2];
        else if(tipoDeEntrada==auxiliar)
            rta=tiposDeEntrada[3];
        return rta;
    }

    /***
     * M�todo para modificaci�n de la propiedad tipoDeEntrada
     * @param   tipoDeEntrada el nuevo valor de la propiedad tipoDeEntrada
     */
    public void setTipoDeEntrada(int tipoDeEntrada)
    {
        this.tipoDeEntrada=tipoDeEntrada;
    }

    /***
     * Regresa una cadena String con los datos del Televisor
     * @override java.lang.Object.toString
     */
    public String toString()
    {
        String str = "\n**********Televisor**********\n";
        str = str + "Entrada: " + this.getTipoDeEntrada()+"\n";
        str = str + "Canal: "  + this.getCanal()+"\n";
        str = str + "Volumen: "  + this.getVolumen()+"\n";
        return str;
    }
}