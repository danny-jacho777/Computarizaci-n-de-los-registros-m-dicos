import java.util.Scanner;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== REGISTRO DE PERFIL MÉDICO ===");
        System.out.print("Primer nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Sexo: ");
        String sexo = scanner.nextLine();
        System.out.print("Día de nacimiento: ");
        int dia = scanner.nextInt();
        System.out.print("Mes de nacimiento: ");
        int mes = scanner.nextInt();
        System.out.print("Año de nacimiento: ");
        int anio = scanner.nextInt();
        System.out.print("Altura (en cm): ");
        double altura = scanner.nextDouble();
        System.out.print("Peso (en kg): ");
        double peso = scanner.nextDouble();

        PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        System.out.println("\n========================================");
        System.out.println("         HISTORIAL MÉDICO PACIENTE      ");
        System.out.println("========================================");
        System.out.println("Nombre: " + perfil.getPrimerNombre() + " " + perfil.getApellido());
        System.out.println("Sexo: " + perfil.getSexo());
        System.out.printf("Fecha de Nacimiento: %02d/%02d/%d\n", perfil.getDiaNacimiento(), perfil.getMesNacimiento(), perfil.getAnioNacimiento());
        System.out.println("Altura: " + perfil.getAltura() + " cm");
        System.out.println("Peso: " + perfil.getPeso() + " kg");
        System.out.println("Edad: " + perfil.calcularEdad() + " años");
        System.out.printf("Índice de Masa Corporal (BMI): %.2f\n", perfil.calcularBMI());
        System.out.println("Frecuencia Cardíaca Máxima: " + perfil.calcularFrecuenciaCardiacaMaxima() + " ppm");
        System.out.println("Rango Frecuencia Esperada: " + perfil.calcularFrecuenciaCardiacaEsperada());

        System.out.println("\n--- VALORES DE REFERENCIA BMI ---");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");

        scanner.close();
    }
}