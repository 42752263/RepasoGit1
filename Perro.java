public class Perro {
    private String nombre;
    private String raza;
    private String edad;

    public Perro() {
    }

    public Perro(String nombre, String raza, String edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
