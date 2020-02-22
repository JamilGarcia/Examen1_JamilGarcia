package examen1_jamilgarcia;

public class Cuenta {
    private String nombre;
    private int edad; 
    private String carrera;
    private String lugarNac;
    private int numeroCuent;
    private String usuario;
    private String contra;

    public Cuenta() {
    }
    
    public Cuenta(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta(String nombre, int edad, String carrera, String lugarNac, int numeroCuent, String usuario, String contra) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.lugarNac = lugarNac;
        this.numeroCuent = numeroCuent;
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLugarNac() {
        return lugarNac;
    }

    public void setLugarNac(String lugarNac) {
        this.lugarNac = lugarNac;
    }

    public int getNumeroCuent() {
        return numeroCuent;
    }

    public void setNumeroCuent(int numeroCuent) {
        this.numeroCuent = numeroCuent;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
