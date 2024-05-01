import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {

        // Clase scanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        // Declaraciones ay asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinidas = new char[palabraSecreta.length()];

        // Estructura de control iterativa
        for (int i = 0; i < letrasAdivinidas.length; i++) {
            letrasAdivinidas[i] = '-';
            // System.out.println(letrasAdivinidas[i]);
        }
        // Estructura de contol: Iterativa (Bucle)

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinidas) + " " + palabraSecreta.length()
                    + " letras");

            System.out.println("Introduce una letra, por favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control : condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinidas[i] = letra;
                    letraCorrecta = true;
                }

            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto! te quedan " + (intentosMaximos - intentos) + " intentos.");

            }
            if (String.valueOf(letrasAdivinidas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades!, has adivinado la palabra secreta: " + palabraSecreta);
            }

            

            
        }
        if (!palabraAdivinada) {
            System.out.println("Que pena te has quedado sin intentos! GAME OVER");
        }
        scanner.close();
    }
}
