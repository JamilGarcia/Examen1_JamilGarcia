package examen1_jamilgarcia;

public class Clase {
   
    private int codigo; 
    private String clase; 

    public Clase() {
    }

    public Clase(int codigo, String clase) {
        this.codigo = codigo;
        this.clase = clase;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    @Override
    public String toString() {
        return clase;
    }
    
    
}
