
public class Reloj
{
   protected int segundos;
   protected int minutos;
   protected int horas;   
   
   public Reloj(){
       segundos=0;
       minutos=0;
       horas=0;
   }
   
   public Reloj(int segundos, int minutos, int horas){
     this.segundos = segundos;
     this.minutos = minutos;
     this.horas = horas;
   }

   /**Metodo de acceso a la propiedad segundos*/
    public int getSegundos(){
        return this.segundos;
    }

    /**Metodo de modificaci�n a la propiedad segundos*/
    public void setSegundos(int segundos){
        this.segundos = segundos;
    }

    /**Metodo de acceso a la propiedad minutos*/
    public int getMinutos(){
        return this.minutos;
    }

    /**Metodo de modificaci�n a la propiedad minutos*/
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }

    /**Metodo de acceso a la propiedad horas*/
    public int getHoras(){
        return this.horas;
    }

    /**Metodo de modificaci�n a la propiedad horas*/
    public void setHoras(int horas){
        this.horas = horas;
    }

   /*De aqui en adelante Ud. debe completar los algoritmos para que el programa funcione*/
   
   /**Metodo para mover le segundero*/ 
   public void moverSegundero(){
      if(segundos>=0 && segundos<59)
         segundos++;
      else if(segundos==59 && minutos<59){
          segundos=0;
          minutos++;
        }
      else if(segundos==59 && minutos==59){
          segundos=0;
          minutos=0;
          horas=1;
        }     
    }

   /**Metodo para mover le minutero*/ 
   public void moverMinutero(){
     if(minutos>=0 && minutos<59)
         minutos++;
      else if(minutos==59 && horas<12){
          minutos=0;
          horas++;
        }
      else if(minutos==59 && horas==12){
          minutos=0;
          horas=1;
        }
   }

   /**Metodo para mover le horario*/ 
   public void moverHorario(){
     if(horas>=0 && horas<12){
         horas++;
   }
   else if(horas==12){
       horas=1;
    }
}
}