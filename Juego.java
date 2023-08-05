public class Juego {
    private static int Check = 0;
    private static int x;
    private static int y;
    public static void main(String[] args) {
        Dado Dado1 = new Dado();
        Dado Dado2 = new Dado();
        Jugador Player1 = new Jugador();
        Jugador Player2 = new Jugador(); 
        Jugador Player3 = new Jugador(); 
        Jugador Player4 = new Jugador();
        

        //Ciclo principal del juego
        while(true) {

            System.out.println("\nPlayer1:");
            //Ciclo para el juego del Player1
            while(true) {
                //Se verifica si el jugador desea continuar
                Player1.Continuar();

                //Se lanzan los dados si se sigue
                if (Player1.getDecision().equals("1")){
                    Dado1.Lanzamiento();
                    Dado2.Lanzamiento();
                    x = Dado1.getCara();
                    y = Dado2.getCara();

                //Agregamos los puntos al punteo, y se elimina todo el puntaje si se obtiene 1 en algún dado
                    Player1.Puntaje(x, y);
                    System.out.println(Player1.toString());
                    System.out.println("-------------------------------");

                //Se verifica que aún no se haya ganado
                    if (Player1.getPuntos() >= 100){
                        System.out.println("¡Felicidades por tu victoria en el juego de PIG!");
                        System.out.println("Eres el maestro de los dados. Disfruta de tu triunfo!\n");
                        System.exit(0);
                        break;
                    }

                    Check = Check + (x + y);
                
                    //Se verifica que no se haya sacado 1 al ver el punteo tras lanzar los dados, sino se salta turno
                    if (Player1.getPuntos() == 0) {
                        Check = 0;
                        break;
                    }

                    //Se revisa que la suma del lanzamiento no sea mayor a 20
                    if (Check >= 20){
                        Check = 0;
                        System.out.println("Has conseguido 20 o más puntos, es el turno del siguiente jugador.");
                        System.out.println("-------------------------------");
                        break;
                    }

                    }

                //Código a mostrar en caso de qué no se quiera seguir tirando
                else if (!Player1.getDecision().equals("1")){
                    Check = 0;
                    System.out.println("Pasando al siguiente jugador.\n");
                    break;
                    } 
            }

            
            System.out.println("\nPlayer2:");
            //Ciclo para el juego del Player2
            while(true) {
                //Se verifica si el jugador desea continuar
                Player2.Continuar();

                //Se lanzan los dados si se sigue
                if (Player2.getDecision().equals("1")){
                    Dado1.Lanzamiento();
                    Dado2.Lanzamiento();
                    x = Dado1.getCara();
                    y = Dado2.getCara();

                //Agregamos los puntos al punteo, y se elimina todo el puntaje si se obtiene 1 en algún dado
                    Player2.Puntaje(x, y);
                    System.out.println(Player2.toString());
                    System.out.println("-------------------------------");

                //Se verifica que aún no se haya ganado
                    if (Player2.getPuntos() >= 100){
                        System.out.println("¡Felicidades por tu victoria en el juego de PIG!");
                        System.out.println("Eres el maestro de los dados. Disfruta de tu triunfo!\n");
                        System.exit(0);
                        break;
                    }

                    Check = Check + (x + y);
                
                    //Se verifica que no se haya sacado 1 al ver el punteo tras lanzar los dados, sino se salta turno
                    if (Player2.getPuntos() == 0) {
                        Check = 0;
                        break;
                    }

                    //Se revisa que la suma del lanzamiento no sea mayor a 20
                    if (Check >= 20){
                        Check = 0;
                        System.out.println("Has conseguido 20 o más puntos, es el turno del siguiente jugador.");
                        System.out.println("-------------------------------");
                        break;
                    }
                }
                //Código a mostrar en caso de qué no se quiera seguir tirando
                else if (!Player2.getDecision().equals("1")){
                    Check = 0;
                    System.out.println("Pasando al siguiente jugador.\n");
                    break;
                } 
            }

            System.out.println("\nPlayer3:");
            //Ciclo para el juego del Player1
            while(true) {
                //Se verifica si el jugador desea continuar
                Player3.Continuar();

                //Se lanzan los dados si se sigue
                if (Player3.getDecision().equals("1")){
                    Dado1.Lanzamiento();
                    Dado2.Lanzamiento();
                    x = Dado1.getCara();
                    y = Dado2.getCara();

                //Agregamos los puntos al punteo, y se elimina todo el puntaje si se obtiene 1 en algún dado
                    Player3.Puntaje(x, y);
                    System.out.println(Player3.toString());
                    System.out.println("-------------------------------");

                //Se verifica que aún no se haya ganado
                    if (Player3.getPuntos() >= 100){
                        System.out.println("¡Felicidades por tu victoria en el juego de PIG!");
                        System.out.println("Eres el maestro de los dados. Disfruta de tu triunfo!\n");
                        System.exit(0);
                        break;
                    }

                    Check = Check + (x + y);
                
                    //Se verifica que no se haya sacado 1 al ver el punteo tras lanzar los dados, sino se salta turno
                    if (Player3.getPuntos() == 0) {
                        Check = 0;
                        break;
                    }

                    //Se revisa que la suma del lanzamiento no sea mayor a 20
                    if (Check >= 20){
                        Check = 0;
                        System.out.println("Has conseguido 20 o más puntos, es el turno del siguiente jugador.");
                        System.out.println("-------------------------------");
                        break;
                    }
                }
                //Código a mostrar en caso de qué no se quiera seguir tirando
                else if (!Player3.getDecision().equals("1")){
                    Check = 0;
                    System.out.println("Pasando al siguiente jugador.\n");
                    break;
                } 
            }

            System.out.println("\nPlayer4:");
            //Ciclo para el juego del Player1
            while(true) {
                //Se verifica si el jugador desea continuar
                Player4.Continuar();

                //Se lanzan los dados si se sigue
                if (Player4.getDecision().equals("1")){
                    Dado1.Lanzamiento();
                    Dado2.Lanzamiento();
                    x = Dado1.getCara();
                    y = Dado2.getCara();

                //Agregamos los puntos al punteo, y se elimina todo el puntaje si se obtiene 1 en algún dado
                    Player4.Puntaje(x, y);
                    System.out.println(Player4.toString());
                    System.out.println("-------------------------------");

                //Se verifica que aún no se haya ganado
                    if (Player4.getPuntos() >= 100){
                        System.out.println("¡Felicidades por tu victoria en el juego de PIG!");
                        System.out.println("Eres el maestro de los dados. Disfruta de tu triunfo!\n");
                        System.exit(0);
                        break;
                    }

                    Check = Check + (x + y);
                
                    //Se verifica que no se haya sacado 1 al ver el punteo tras lanzar los dados, sino se salta turno
                    if (Player4.getPuntos() == 0) {
                        Check = 0;
                        break;
                    }

                    //Se revisa que la suma del lanzamiento no sea mayor a 20
                    if (Check >= 20){
                        Check = 0;
                        System.out.println("Has conseguido 20 o más puntos, es el turno del siguiente jugador.");
                        System.out.println("-------------------------------");
                        break;
                    }
                }
                //Código a mostrar en caso de qué no se quiera seguir tirando
                else if (!Player4.getDecision().equals("1")){
                    Check = 0;
                    System.out.println("Pasando al siguiente jugador.\n");
                    break;
                } 
            }
    }
}

}
