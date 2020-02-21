package examen1_jamilgarcia;

public class Alumnos extends Cuenta{
    
    private int conoAcum;
    private int nvlApren; 
    private int exaRea;

    public Alumnos() {
        super();
    }

    public Alumnos(int conoAcum, int nvlApren, int exaRea, String nombre, int edad, String carrera, String lugarNac, int numeroCuent, String usuario, String contra) {
        super(nombre, edad, carrera, lugarNac, numeroCuent, usuario, contra);
        this.conoAcum = conoAcum;
        this.nvlApren = nvlApren;
        this.exaRea = exaRea;
    }

    public int getConoAcum() {
        return conoAcum;
    }

    public void setConoAcum(int conoAcum) {
        this.conoAcum = conoAcum;
    }

    public int getNvlApren() {
        return nvlApren;
    }

    public void setNvlApren(int nvlApren) {
        this.nvlApren = nvlApren;
    }

    public int getExaRea() {
        return exaRea;
    }

    public void setExaRea(int exaRea) {
        this.exaRea = exaRea;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "conoAcum=" + conoAcum + ", nvlApren=" + nvlApren + ", exaRea=" + exaRea + '}';
    }
    
    
}
