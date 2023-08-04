import java.util.Random;

public class Dado {
    private int Cara;
    private int num;
    private Random aleatorio = new Random();

    //Definir valor
    public void Lanzamiento() {
        num = aleatorio.nextInt(6-1+1)+1;
        setCara(num);
    }


    //Setters y Getters
    public void setCara(int cara) {
        this.Cara = cara;
    }

    public int getCara() {
        return this.Cara;

    }
    
    
}
