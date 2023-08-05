//Bryan Alberto Martínez Orellana
//Carnét 23542
//Ingeniería en Ciencias de la Computación
//Programación Orientada a Objetos
//Creación: 04/08/2023
//Última modificación: 05/08/2023

//importamos Random para la dinámica del dado
import java.util.Random;

public class Dado {
    //Declaración de atributos
    private int Cara;
    private int num;
    private Random aleatorio = new Random();

    //Definir valor de la cara del dado
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
