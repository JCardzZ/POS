package animaltarea;
//SUB CLASE02

public class Gato extends Animal {

    private char genero;
    private String color;

    public Gato(char genero, String color, String nombredeMascota, String propietario, int edad) {
        super(nombredeMascota, propietario, edad);
        this.genero = genero;
        this.color = color;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", Genero del gato: " + genero + ", Color del gato:" + color;
    }

}
