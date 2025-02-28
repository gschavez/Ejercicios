import java.util.Random;

public class Dados {
    public static void main(String[] args) {

        int maxR = 10;
        int minR = 1;
        int numR;

        Random gAle = new Random();

        numR = gAle.nextInt(maxR - minR + 1) + minR;

        boolean dado1 = true;
        boolean dado2 = true;
        int veces1 = 0;
        int veces2 =0;
        int maxD1 = 6;
        int minD1 = 1;
        int numD1;
        int suma1 = 0, suma2 = 0;

        int numD2;

        while (dado1 == true){

            numD1 = gAle.nextInt(maxD1 - minD1 + 1) + minD1;
            veces1++;
            suma1 += numD1;
            System.out.println("Dado 1: " + numD1);

            if (veces1 >= maxR){
                dado1 = false;

                while (dado2 == true){
                    numD2 = gAle.nextInt(maxD1 - minD1 + 1) + minD1;
                    veces2++;
                    suma2 += numD2;
                    System.out.println("Dado 2: " + numD2 );


                    if (veces2 >= maxR){
                        dado2 = false;

                    }
                }
            }
        }
        System.out.println("la suma de los primeros dados es: " + suma1);
        System.out.println("la suma de los segundos dados es: " + suma2);
        if(suma1 > suma2){
            System.out.println("el Dado numero 1 gano");
        }
        else{
            System.out.println("el Dado numero dos gano");
        }
    }
}