import java.util.Random;
import java.util.Scanner;

public class DadosDelDestino {
    public static void main(String[] args) {

        int max = 6;
        int min = 1;
        int rNum = 0;
        int vidas = 5;
        int puntos = 0;
        boolean play =true;
        Random Alenum = new Random();
        Scanner scanner = new Scanner(System.in);
        String cntr;
        int nvueltas = 0;



        while (play){
            rNum=Alenum.nextInt(max - min +1)+min;


            System.out.println("Oprime la tecla X para lanzar los dados. ");
            cntr= scanner.next();

            if (cntr.equals("x")){
                System.out.println("El dado saco el numero: " + rNum);

                int vuelta = switch (rNum){
                    case 1-> vidas -= 1;
                    case 2 -> puntos += 1;
                    case 3 ->  0;
                    case 4 -> puntos += 1;
                    case 5 -> 0;
                    default -> puntos+=3;

                };
                System.out.println("Puntos = " + puntos);
                System.out.println("Vidas = " + vidas);
                nvueltas += 1;
                System.out.println("Nuemeron de Vuelta " + nvueltas );

                if (vidas==0){
                    System.out.println("Perdiste");
                    break;

                }
                if (puntos>=10){
                    System.out.println("Ganaste!!");
                    break;
                }
            }
        }
    }
}