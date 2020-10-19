/**
 * Complete
 * @author
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
import java.lang.Math.*;
class MaquinaCafetera {

    int cafe;
    int azucar;
    int vasos;
    int precioBaseCafe;
    int egresos;
    int ingresos;
    int gananciasBrutas;
    int impuestos;
    int gananciasNetas;
    /*No requiere propiedades adicionales, pero es libre de usarlas*/

   
    MaquinaCafetera(){
     //complete
     cafe=0;
     azucar=0;
     vasos=0;
     egresos=0;
     ingresos=0;
    }
   
    MaquinaCafetera(int cantidadInicialCafe, int cantidadInicialAzucar, int cantidadInicialVasos){
     //complete
     this.cafe=cantidadInicialCafe;
     this.azucar=cantidadInicialAzucar;
     this.vasos=cantidadInicialVasos;
    }
   
    //complete metodos GET / SET
     public int getCafe(){
         return this.cafe;
        }
   
     public int getAzucar(){
         return this.azucar;
        }
     
     public int getVasos(){
         return this.vasos;
        }
       
     public int getPrecioBaseCafe(){
         return this.precioBaseCafe;
        }
       
     public int getEgresos(){
         return this.egresos;
        }
       
     public int getIngresos(){
         return this.ingresos;
        }
       
     public int getGananciasBrutas(){
         return this.gananciasBrutas;
        }
       
     public int getImpuestos(){
         return this.impuestos;
        }
       
     public int getGananciasNetas(){
         return this.gananciasNetas;
        }
       
     public void setCafe(int cafe){
         this.cafe=cafe;
        }
       
     public void setAzucar(int azucar){
         this.azucar=azucar;
        }
       
     public void setVasos(int vasos){
         this.vasos=vasos;
        }
     
     public void setPrecioBaseCafe(int precioBaseCafe){
         this.precioBaseCafe=precioBaseCafe;
        }
       
     public void setEgresos(int egresos){
         this.egresos=egresos;
        }
       
     public void setIngresos(int ingresos){
         this.ingresos=ingresos;
        }
       
     public void setGananciasBrutas(int gananciasBrutas){
         this.gananciasBrutas=gananciasBrutas;
        }
       
     public void setImpuestos(int impuestos){
         this.impuestos=impuestos;
        }
       
     public void setGananciasNetas(int gananciasNetas){
         this.gananciasNetas=gananciasNetas;
        }
       
    public int calcularPrecio(int tipoCafe, int cantidadAzucar) {
        double precio =(int) Math.floor(0);
        int precioTintos=precioBaseCafe/1000*(tipoCafe*55);
        int ganancias=0;
        int subTotal = 0;
        int sobreCosto5 = (int) Math.floor(precioBaseCafe/1000*(tipoCafe*55)*0.05);
        int sobreCosto10 = (int) Math.floor(precioBaseCafe/1000*(tipoCafe*55)*0.1);
        
        if(cantidadAzucar==1){
            ganancias=precioTintos*15/100;
            precio = precioTintos+ganancias;
        }
        
        else if(cantidadAzucar==2){
            subTotal= precioTintos+sobreCosto5;
            ganancias=subTotal*15/100;
            precio = subTotal+ganancias;
        }
        
        else if(cantidadAzucar==3){
            subTotal= precioTintos+sobreCosto10;
            ganancias=subTotal*15/100;
            precio = subTotal+ganancias;
        }
       
        return (int)precio;
    }

    public boolean recargarCafe(int cantidadCafe, int costoCompraCafe) {
      //complete
      boolean sePuedeRecargar= cantidadCafe>0 && (costoCompraCafe*cantidadCafe)<=gananciasNetas;
      
      if(sePuedeRecargar){
          cafe+=cantidadCafe;
          egresos+=costoCompraCafe;
          registrarFactura(0);
      }
      
      else sePuedeRecargar = false;
      return sePuedeRecargar;
    }

    public boolean recargarAzucar(int cantidadAzucar, int costoCompraAzucar) {
      //complete
      boolean sePuedeRecargar= cantidadAzucar>0 && (costoCompraAzucar*cantidadAzucar)<=gananciasNetas;
      
      if(sePuedeRecargar){
          azucar+=cantidadAzucar;
          registrarFactura(0);
          egresos +=costoCompraAzucar;
      }
     return sePuedeRecargar;
}

    public boolean recargarVasos(int cantidadVasos, int costoCompraVasos) {
      //complete
      boolean sePuedeRecargar= cantidadVasos>=0 && (costoCompraVasos*cantidadVasos)<=gananciasNetas;
      if(sePuedeRecargar){
          vasos+=cantidadVasos;
          registrarFactura(0);
          egresos+=costoCompraVasos;
      }
      return sePuedeRecargar;
    }

    public boolean prepararCafe(int tipoCafe, int cantidadAzucar) {
      //complete
      boolean sePuedePreparar=false;
      
      
      if(tipoCafe == 1 && cantidadAzucar == 1 && vasos>0)
      {if((tipoCafe*55)<=cafe && 0<=azucar && vasos>0)
         {sePuedePreparar=true;
          
          cafe-=(int)(tipoCafe*55);
              vasos--;
           
            sePuedePreparar=true;
        }}
        else if(tipoCafe == 1 && cantidadAzucar == 2 && vasos>0)
      {if((tipoCafe*55)<=cafe && 5<=azucar && vasos>0)
         {sePuedePreparar=true;
         
          cafe-=(int)(tipoCafe*55);
              azucar-=5;
              vasos--;
            
          sePuedePreparar=true;
        }}
        else if(tipoCafe == 1 && cantidadAzucar == 3 && vasos>0)
      {if((tipoCafe*55)<=cafe && 5<=azucar && vasos>0)
         {sePuedePreparar=true;
         
          cafe-=(int)(tipoCafe*55);
              azucar-=10;
              vasos--;
           
          sePuedePreparar=true;
        }}
        else if(tipoCafe == 2 && cantidadAzucar == 1 && vasos>0)
      {if((tipoCafe*55)<=cafe && 5<=azucar && vasos>0)
         {sePuedePreparar=true;
         
          cafe-=(int)(tipoCafe*55);
              
              vasos--;
           
          sePuedePreparar=true;
        }}
      else if(tipoCafe == 2 && cantidadAzucar == 2 && vasos>0)
      {if((tipoCafe*55)<=cafe && 5<=azucar && vasos>0)
         {sePuedePreparar=true;
         
          cafe-=(int)(tipoCafe*55);
              azucar-=5;
              vasos--;
            
          sePuedePreparar=true;
        }}
        else if(tipoCafe == 2 && cantidadAzucar == 3 && vasos>0)
      {if((tipoCafe*55)<=cafe && 5<=azucar && vasos>0)
         {sePuedePreparar=true;
         
          cafe-=(int)(tipoCafe*55);
              azucar-=10;
              vasos--;
            ingresos+=calcularPrecio(tipoCafe,cantidadAzucar);
          sePuedePreparar=true;
        }}
        else if(tipoCafe == 3 && cantidadAzucar == 1 && vasos>0)
      {if((tipoCafe*55)<=cafe && 5<=azucar && vasos>0)
         {sePuedePreparar=true;
         
          cafe-=(int)(tipoCafe*55);
              
              vasos--;
           
          sePuedePreparar=true;
        }}
        else if(tipoCafe == 3 && cantidadAzucar == 2 && vasos>0)
      {if((tipoCafe*55)<=cafe && 5<=azucar && vasos>0)
         {sePuedePreparar=true;
         
          cafe-=(int)(tipoCafe*55);
              azucar-=5;
              vasos--;
            
          sePuedePreparar=true;
        }}
        else if(tipoCafe == 3 && cantidadAzucar == 3 && vasos>0){
            if((tipoCafe*55)<=cafe && 10<=azucar && vasos>0)
         {sePuedePreparar=true;
        
          cafe-=(int)(tipoCafe*55);
              azucar-=10;
              vasos--;
            
            sePuedePreparar=true;
        }
         }
       else sePuedePreparar = false;
        return sePuedePreparar;
        
    //if(tipoCafe>=1 && tipoCafe<=3 && cantidadAzucar>=1 && cantidadAzucar<=3)
     // sePuedePreparar = (tipoCafe*55)<=cafe && (-5*(1-cantidadAzucar))<=azucar && vasos>1;
      //if(sePuedePreparar){
       // cafe-=((tipoCafe)*55);
       // azucar-=(-5*(1-cantidadAzucar));
      //  vasos--;
    //}
      
    }

    public void registrarFactura(int valorFactura) {
        ingresos+=valorFactura;
        gananciasBrutas=ingresos-egresos;
        impuestos=(ingresos*16)/100;
        gananciasNetas=gananciasBrutas-impuestos;
    }

}