/**
 * Un ejemplo que modela un Reloj simple usando POO
 * 
 * @author Julian Camilo Riveros Fonseca
 */
public class Reloj 
{  
    int segundos;
    int minutos;
    int horas;

    
    /**Debe inicializar a la media noche o medio dia 12:00:00*/
    public Reloj(){  
        horas=12;
        minutos=0;
        segundos=0;
    }

    /**Inicializa de acuerdo con los parametros*/
    public Reloj(int segundos, int minutos, int horas){
     this.segundos = segundos;
     this.minutos = minutos;
     this.horas = horas;
    }

    /**Metodo de acceso a la propiedad segundos*/
    public int getSegundos(){
        return this.segundos;
    }

    /**Metodo de modificación a la propiedad segundos*/
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }

    /**Metodo de acceso a la propiedad minutos*/
    public int getMinutos(){
        return this.minutos;
    }

    /**Metodo de modificación a la propiedad minutos*/
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }

    /**Metodo de acceso a la propiedad horas*/
    public int getHoras(){
        return this.horas;
    }

    /**Metodo de modificación a la propiedad horas*/
    public void setHoras(int horas){
        this.horas = horas;
    }

    
    /**Metodo para avanzar el segundero*/ 
    public void avanzarSegundero(){
        segundos++;
        if(segundos==60){
        segundos=0;
        avanzarMinutero();
        }
    }

    /**Metodo para retroceder el segundero*/ 
    public void retrocederSegundero(){
        segundos--;
        if(segundos==-1){
        segundos=59;
        retrocederMinutero();
        }
    }
    
    /**Metodo para avanzar el minutero*/ 
    public void avanzarMinutero(){
       minutos++;
       if(minutos==60){
        minutos=0;
        avanzarHorario();
        }
    }

    /**Metodo para avanzar el minutero*/ 
    public void retrocederMinutero(){  
        minutos--;
        if(minutos==-1){
        minutos=59;
        retrocederHorario();
        }
    }

    /**Metodo para avanzar el horario*/ 
    public void avanzarHorario(){
        horas++;
        if(horas==13) horas=1;
    }

    /**Metodo para avanzar el horario*/ 
    public void retrocederHorario(){
        horas--;
     if(horas==0)
        horas=12;
    }

}