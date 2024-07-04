import java.util.List;

public class User<T> {
    private String nombre;
    private int edad;
    private List<String> interests;

    public User(String nombre, int edad, List<String> interests) {
        this.nombre = nombre;
        this.edad = edad;
        this.interests = interests;
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

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
    
    
}
