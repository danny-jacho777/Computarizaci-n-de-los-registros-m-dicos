import java.time.LocalDate;

public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double altura; // en cm
    private double peso;   // en kg

    public PerfilMedico(String primerNombre, String apellido, String sexo, int diaNacimiento, int mesNacimiento, int anioNacimiento, double altura, double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.altura = altura;
        this.peso = peso;
    }

    public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }
    public String getPrimerNombre() { return primerNombre; }

    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getApellido() { return apellido; }

    public void setSexo(String sexo) { this.sexo = sexo; }
    public String getSexo() { return sexo; }

    public void setDiaNacimiento(int diaNacimiento) { this.diaNacimiento = diaNacimiento; }
    public int getDiaNacimiento() { return diaNacimiento; }

    public void setMesNacimiento(int mesNacimiento) { this.mesNacimiento = mesNacimiento; }
    public int getMesNacimiento() { return mesNacimiento; }

    public void setAnioNacimiento(int anioNacimiento) { this.anioNacimiento = anioNacimiento; }
    public int getAnioNacimiento() { return anioNacimiento; }

    public void setAltura(double altura) { this.altura = altura; }
    public double getAltura() { return altura; }

    public void setPeso(double peso) { this.peso = peso; }
    public double getPeso() { return peso; }

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - anioNacimiento;
        if (fechaActual.getMonthValue() < mesNacimiento ||
                (fechaActual.getMonthValue() == mesNacimiento && fechaActual.getDayOfMonth() < diaNacimiento)) {
            edad--;
        }
        return edad;
    }

    public int calcularFrecuenciaCardiacaMaxima() {
        return 220 - calcularEdad();
    }

    public String calcularFrecuenciaCardiacaEsperada() {
        int max = calcularFrecuenciaCardiacaMaxima();
        return String.format("%.0f - %.0f lpm", max * 0.50, max * 0.85);
    }

    public double calcularBMI() {
        double alturaMetros = altura / 100.0;
        return peso / (alturaMetros * alturaMetros);
    }
}