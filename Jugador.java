//Bryan Alberto Martínez Orellana
//Carnét 23542
//Ingeniería en Ciencias de la Computación
//Programación Orientada a Objetos
//Creación: 04/08/2023
//Última modificación: 05/08/2023

//Importamos la librería Scanner para solicitar datos
import java.util.Scanner;

public class Jugador {
    //Declaramos los atributos del objeto
    private int Puntos;
    private String Decision;
    private int Suma = 0;
    Scanner teclado = new Scanner(System.in);

    //Constructor, establece el valor de los puntos
    public Jugador(){
        Puntos = 0;
    }

    //Setters y Getters para los atributos
    public void setPuntos(int Puntos){
        this.Puntos = Puntos;
    }
    public int getPuntos() {
        return this.Puntos;
    }
    public void setDecision(String Decision){
        this.Decision = Decision;
    }
    public String getDecision(){
        return this.Decision;
    }
    public void setSuma(int Suma){
        this.Suma = Suma;
    }
    public int getSuma() {
        return this.Suma;
    }

    //Método para definir lo que el jugador quiera hacer con su turno
    public void Continuar() {
        System.out.println("\n¿Deseas seguir lanzando? Colocar 1 si desea seguir o cualquier otra tecla si quiere parar.");
        this.Decision = teclado.nextLine();
        
    }

    //Método para establecer los valores de los dados, agregarlos al puntaje.
    //O saber si se ha obtenido un 1 para resetear el punteo.
    public void Puntaje(int Dado1, int Dado2){
        Suma = Dado1 + Dado2;
        System.out.println("-------------------------------");
        System.out.println("Has obtenido un " + Dado1 + " y un " + Dado2 + ".");
        System.out.println("-------------------------------");

        if (Dado1 == 1 || Dado2 == 1){
            setPuntos(0);
            System.out.println("Oh no, qué mala suerte!!! Es un 1 :(");
            System.out.println("Es el turno del siguiente jugador.");
        }
        else {
            Puntos += Suma;
            setSuma(0);

        }
    }
    //Mensaje a mostrar para conocer el puntaje
    public String toString() {
        return "Tu punteo actual es de: " + this.Puntos + ".";
    }

}
