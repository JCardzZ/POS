package animaltarea;
//SUB CLASE01
public class Perro extends Animal {

    private int NumeroVacunas;
    private float peso;
    private int numerodePatas;

    public Perro(String nombredeMascota, String propietario, int edad, int NumeroVacunas, float peso, int numerodePatas) {
        super(nombredeMascota, propietario, edad);
        this.NumeroVacunas = NumeroVacunas;
        this.peso = peso;
        this.numerodePatas = numerodePatas;
    }

    public int getNumeroVacunas() {
        return NumeroVacunas;
    }

    public void setNumeroVacunas(int NumeroVacunas) {
        this.NumeroVacunas = NumeroVacunas;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getNumerodePatas() {
        return numerodePatas;
    }

    public void setNumerodePatas(int numerodePatas) {
        this.numerodePatas = numerodePatas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de Vacunas: " + NumeroVacunas + ", Peso: " + peso + ", Numero de Patas: " + numerodePatas;
    }

}
