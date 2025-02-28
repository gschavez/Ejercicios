import java.util.Random;
import java.util.Scanner;

public class Casino {
    public static void main(String[] args) {
        int max = 3;
        int min = 1;
        int rnum = 0;
        int dinero = 0;
        boolean play=true;
        String respuesta;

        System.out.println("Ingresa la cantidad de dinero que quiere apostar: ");
        Scanner scanner = new Scanner(System.in);
        dinero= scanner.nextInt();


        while (play){
            Random numAle = new Random();
            rnum=numAle.nextInt(max-min + 1)+min;

            System.out.println("Tienes " + dinero + " pesos");


            if (rnum == 1){
                dinero= dinero*2;
                System.out.println("Tu dinero se duplico ahora tienes: " + dinero);
                System.out.println("queires seguir jugando?");
                respuesta=scanner.next();
                if (respuesta.equals("no")){

                    play = false;

                }else {
                    play = true;
                }
            }
            else if (rnum == 2){
                dinero= dinero/2;
                System.out.println("Perdiste la mitad de tu dinero, ahora tienes: " + dinero);
                System.out.println("queires seguir jugando?");
                respuesta=scanner.next();
                if (respuesta.equals("no")){
                    play = false;
                }else {
                    play = true;
                }
            }
            if (rnum == 3){
                dinero = 0;
                System.out.println("Perdiste todo tu dinero: ");
                respuesta=scanner.next();
                play=false;





























            }


        }


    }
}
