package animaltarea;
//SUPER CLASE
public class Animal {

    private String nombredeMascota;;
    private String propietario;
    private int edad;

    public Animal(String nombredeMascota, String propietario, int edad) {
        this.nombredeMascota = nombredeMascota;
        this.propietario = propietario;
        this.edad = edad;
    }

    public String getNombredeMascota() {
        return nombredeMascota;
    }

    public void setNombredeMascota(String nombredeMascota) {
        this.nombredeMascota = nombredeMascota;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal: " + "Nombre de la Mascota: " + nombredeMascota + ", Propietario de la mascota: " + propietario + ", Edad: " + edad;
    }

   
   
    
}
