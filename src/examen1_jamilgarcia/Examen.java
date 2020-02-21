package examen1_jamilgarcia;

public class Examen {
    
    private String clase;
    private int conoreq; 
    private String tema; 
    private int puntaje; 

    public Examen() {
    }

    public Examen(String clase, int conoreq, String tema, int puntaje) {
        this.clase = clase;
        this.conoreq = conoreq;
        this.tema = tema;
        this.puntaje = puntaje;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getConoreq() {
        return conoreq;
    }

    public void setConoreq(int conoreq) {
        this.conoreq = conoreq;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Examen{" + "clase=" + clase + ", conoreq=" + conoreq + ", tema=" + tema + ", puntaje=" + puntaje + '}';
    }
    
    
}
