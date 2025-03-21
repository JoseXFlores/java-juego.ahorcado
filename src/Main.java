
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos=10;
        int intentos= 0;
        boolean palabraAdivinada = false;

        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for ( int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        //Estructura de control: Interativa (Bucle)
        while(!palabraAdivinada && intentos < intentosMaximos) {

                System.out.println("Palabra a adivinar:" + String.valueOf(letrasAdivinadas) + "("+ palabraSecreta.length() + " letras)");
                System.out.println("Introduce una letra, por favor");

                //Usamos la clase scanner para pedir una letra
                char letra = Character.toLowerCase(teclado.nextLine().charAt(0));

                boolean letraCorrecta = false;
                //Estructura de control: Interativa (Bucle)
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    //Estructura de control: condicional
                    if (palabraSecreta.charAt(i) == letra) {
                        letrasAdivinadas[i] = letra;
                        letraCorrecta = true;
                    }
                }

                if (letraCorrecta) {
                    intentos++;
                    System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos.");
                }
                if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                    palabraAdivinada = true;
                    System.out.println("Felicidades, has adiivinado la palabra secreta: " + palabraSecreta);
                }
            }
        if(!palabraAdivinada) {
            System.out.println("Que pena, te quedaste sin intentos! GAME OVER");
        }
        teclado.close();
    }
}