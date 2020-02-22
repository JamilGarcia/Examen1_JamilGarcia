package examen1_jamilgarcia;

public class Tutores extends Cuenta{
    
    private String clase;
    private int ganancias;
    private int tutos;
    private int nvlense;

    public Tutores() {
        super();
    }

    public Tutores(String clase, int ganancias, int tutos, int nvlense, String nombre, int edad, String carrera, String lugarNac, int numeroCuent, String usuario, String contra) {
        super(nombre, edad, carrera, lugarNac, numeroCuent, usuario, contra);
        this.clase = clase;
        this.ganancias = ganancias;
        this.tutos = tutos;
        this.nvlense = nvlense;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getTutos() {
        return tutos;
    }

    public void setTutos(int tutos) {
        this.tutos = tutos;
    }

    public int getNvlense() {
        return nvlense;
    }

    public void setNvlense(int nvlense) {
        this.nvlense = nvlense;
    }

    @Override
    public String toString() {
        return "Tutores{" + "clase=" + clase + ", ganancias=" + ganancias + ", tutos=" + tutos + ", nvlense=" + nvlense + '}';
    }
    
    public void ganacia(){
        ganancias += 270;
    }
}
