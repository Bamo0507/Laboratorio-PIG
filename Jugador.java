import java.util.Scanner;

public class Jugador {
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

    public int getSuma() {
        return this.Suma;
    }

    //Demás métodos

    public void Continuar() {
        System.out.println("¿Deseas seguir lanzando? Colocar 1 si desea seguir o cualquier otra tecla si quiere parar.\n");
        Decision = teclado.nextLine();
        
    }

    public void Puntaje(int Dado1, int Dado2){
        Suma = Dado1 + Dado2;
        if (Dado1 == 1 || Dado2 == 1){
            setPuntos(0);
            System.out.println("Lamentablemente has obtenido un 1, tus puntos están en 0 :( \n");
        }
        else {
            Puntos += Suma;
            Suma = 0;
        }
    }

    public String toString() {
        return "Tu punteo actual es de: " + this.Puntos + ".\n";
    }

}
