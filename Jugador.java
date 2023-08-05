import java.util.Scanner;

public class Jugador {
    //Atributos
    private int Puntos;
    private String Decision;
    private int Suma = 0;
    Scanner teclado = new Scanner(System.in);

    //Constructor
    public Jugador(){
        Puntos = 0;
    }

    //Setters y Getters
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

    //Demás métodos
    public void Continuar() {
        System.out.println("\n¿Deseas seguir lanzando? Colocar 1 si desea seguir o cualquier otra tecla si quiere parar.");
        this.Decision = teclado.nextLine();
        
    }
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

    public String toString() {
        return "Tu punteo actual es de: " + this.Puntos + ".";
    }

}
