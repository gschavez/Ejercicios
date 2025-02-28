import java.util.Random;
import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {

        System.out.println("Bienvanido al juego");
        System.out.println("Adivina el numero");

        int max = 50;
        int min = 1;
        int num;
        int intentos = 3;
        int unum;
        Boolean cel = true;


        Random numAle = new Random();
        num=numAle.nextInt(max - min + 1) + min;

        for (int i=0;i<intentos;){
            System.out.println("escribe un numero entre 1 y 50");
            Scanner scanner = new Scanner(System.in);
            unum=scanner.nextInt();

            if (unum < num){
                System.out.println("el numero es mayor");
            }else if (unum > num){
                System.out.println("el numero es menor");
            }else{
                System.out.println("Ganaste!!!!");
                cel = false;
                break;
            }intentos --;
        }
        if (cel == false){

            System.out.println("fin del juego");

        }else{ System.out.println("te quedaste sin intentos, el numero era " + num);

        }

    }
}
