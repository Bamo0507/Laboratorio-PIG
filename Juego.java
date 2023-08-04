public class Juego {
    private static boolean Fin = false;
    private int Check = 0;
    public static void main(String[] args) {
        Dado Dado1 = new Dado();
        Dado Dado2 = new Dado();
        Jugador Player1 = new Jugador();
        Jugador Player2 = new Jugador(); 
        Jugador Player3 = new Jugador(); 
        Jugador Player4 = new Jugador();
        


        while(Fin == false) {
            System.out.println("Es el turno del Player1");
            while(true) {
                Player1.Continuar();
                if (Player1.getDecision() == "1"){
                    Dado1.Lanzamiento();
                    Dado2.Lanzamiento();
                    Player1.Puntaje(Dado1.getCara(), Dado2.getCara());
                    Check = 
                    Player1.toString();
                else if (Player1.getDecision() != "1"){
                    System.out.println("Pasando al siguiente jugador.\n");
                    break;
                }

            
            

            

            }

    }
}

}
}