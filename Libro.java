
/**
 * Lógica de negocio
 * 
 * @author Julian Riveros 
 */
public class Libro
{
    String titulo; 
    String editorial;
    String autores;
    int añoEdicion; 
    int numeroDePaginas;
    int valor;   
    int numeroDeCopias;
    int copiasPrestadas;

    public Libro()
    {
    }

    public Libro(String titulo, String editorial, String autores, int añoEdicion, int numeroDePaginas, int valor, int numeroDeCopias, int copiasPrestadas) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.autores = autores;
        this.añoEdicion = añoEdicion;
        this.numeroDePaginas = numeroDePaginas;
        this.valor = valor;
        this.numeroDeCopias = numeroDeCopias;
        this.copiasPrestadas = copiasPrestadas;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo; 
    }

    public String getEditorial()
    {
        return editorial;
    }

    public void setEditorial(String editorial)
    {
        this.editorial = editorial;
    }

    public String getAutores()
    {
        return autores;
    }

    public void setAutores(String autores)
    {
        this.autores = autores;
    }

    public int getAñoEdicion()
    {
        return añoEdicion;
    }

    public void setAñoEdicion(int añoEdicion)
    {
        this.añoEdicion =  añoEdicion;
    }

    public int getNumeroDePaginas()
    {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas)
    {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getPrecio()
    {
        return valor;
    }

    public void setPrecio(int precio)
    {
        valor = precio;
    }

    public int getNumeroDeCopias()
    {
        return numeroDeCopias;
    }

    public int getNumeroDeCopiasPrestadas()
    {
        return copiasPrestadas;
    }//fin getNumeroDeCopiasPestadas

    public int getNumeroDeCopiasDisponibles()
    {
        return this.numeroDeCopias - this.copiasPrestadas;
    }

    public boolean prestar()
    {
        if(getNumeroDeCopiasDisponibles() > 0){
            copiasPrestadas++;
            getNumeroDeCopiasDisponibles();
            return true;
        } else return false;
    }

    public boolean devolver()
    {
        if(getNumeroDeCopiasPrestadas() > 0)
        {
            copiasPrestadas --;
            getNumeroDeCopiasDisponibles(); //actulizar el valor de numero de copias disponibles
            return true;
        } else return false;
    }

    public boolean cambiarNumeroDeCopias(int numeroDeCopias)
    {
        if(numeroDeCopias >= copiasPrestadas)
        {
            this.numeroDeCopias = numeroDeCopias;
            return true;
        } else return false;
    }

    public String toString()
    {
        String str = "\n**********Libro**********\n";
        str = str + "Titulo: " + this.getTitulo()+"\n";
        str = str + "Autores: "  + this.getAutores()+"\n";
        str = str + "Editorial: "  + this.getEditorial()+"\n";
        str = str + "Año: "  + this.getAñoEdicion()+"\n";
        str = str + "Paginas: "  + this.getNumeroDePaginas()+"\n";
        str = str + "Precio: "  + this.getPrecio()+"\n";      
        str = str + "Copias: "  + this.getNumeroDeCopias()+"\n";
        str = str + "Copias Disponibles: "  + this.getNumeroDeCopiasDisponibles()+"\n";
        str = str + "Copias Prestadas: "  + this.getNumeroDeCopiasPrestadas()+"\n";
      return str;
    }

}