public class Triangulo {

    protected float lado1;
    protected float lado2;
    //Lado3 como hipotenusa
    protected float lado3;

    public Triangulo() 
    {
        
    }

    public Triangulo(float lado1, float lado2, float lado3) 
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /*complete GET/SET*/
    
    public String getTipo() 
    {
     String tipo = "Desconocido";

     if(lado1==lado2 && lado1==lado3 && lado2==lado3)
      tipo = "Equilatero";
     else {
            if((lado1!=lado2 && lado1==lado3) || (lado1!=lado3 && lado1==lado2)  || (lado2!=lado3 && lado2==lado1))
                tipo = "Isosceles";
            else
                tipo = "Escaleno";
                if(esRectangulo())
                    tipo = tipo + " Rectángulo";
          }//fin else
     
     return tipo;
    }//fin método getTipo
    
    public boolean esRectangulo()
    {
       float A = lado1*lado1, B = lado2*lado2, C = lado3*lado3;
       return A == B+C || B == A+C|| C == A+B;//complete
    }//fin método esRectangulo
    
    //Start GetterSetterExtension Code
    /**Getter method lado1*/
    public float getLado1(){
        return this.lado1;
    }//end method getLado1

    /**Setter method lado1*/
    public void setLado1(float lado1){
        this.lado1 = lado1;
    }//end method setLado1

    /**Getter method lado2*/
    public float getLado2(){
        return this.lado2;
    }//end method getLado2

    /**Setter method lado2*/
    public void setLado2(float lado2){
        this.lado2 = lado2;
    }//end method setLado2

    /**Getter method lado3*/
    public float getLado3(){
        return this.lado3;
    }//end method getLado3

    /**Setter method lado3*/
    public void setLado3(float lado3){
        this.lado3 = lado3;
    }//end method setLado3

    //End GetterSetterExtension Code
}//End class !

