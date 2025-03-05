package src;

import java.util.Random;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        int num1;
        int num2;
        boolean play=true;
        String signo;
        Scanner scaner = new Scanner(System.in);
        String answ;
        Random numAle = new Random();
        boolean operacionValida = true;

        while (play) {

            num1 = numAle.nextInt(max - min + 1) + min;
            num2 = numAle.nextInt(max - min + 1) + min;
            System.out.println("Se generaron los siguientes numeros = " + num1 + " " + num2);
            System.out.println("Escribe la operacion que deseas realizar");
            signo = scaner.next();

            double respuesta = switch (signo) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> num1 / num2;
                case "^" -> Math.pow(num1, num2);
                case "%" -> num1 % num2;
                default -> {
                    System.out.println("El caracter ingresado no es valido");
                    operacionValida = false;
                    yield Double.NaN;

                }
            };
            if (operacionValida) {
                System.out.println("El resultado de " + num1 + " " + signo + " " + num2 + " es: " + respuesta);
            }

            System.out.println("¿Quieres seguir calculando números? (sí/no)");
            answ = scaner.next();

            if (answ.equalsIgnoreCase("no")) {
                System.out.println("Calcularemos en otra ocasión. :)");
                play = false;
            } else {
                System.out.println("Bien, Sigamos jugando. ");
            }
        }


        /*while (play){                                        CODIGO ANTES DEl ARREGLO

            Random numAle = new Random();

            num1=numAle.nextInt(max-min+1)+min;
            num2=numAle.nextInt(max-min+1)+min;
            System.out.println("Se generaron los siguientes numeros = " + num1 + " " +  num2 );
            System.out.println("Escribe la operacion que deseas realizar");
            operacion=scaner.next();

            if (operacion.equals("+")){
                respuesta=num1+num2;
                System.out.println("Respuesta " + num1 + " + " + num2 + " = " + respuesta);
                System.out.println("¿Quieres seguir calculando mas numeros?");
                answ=scaner.next();
                if (answ.equals("no")){
                    System.out.println("Gracias por jugar... :)");
                    play=false;
                }
            }
            else if (operacion.equals("-")){
                respuesta=num1-num2;
                System.out.println("La respuesta de la resta " + num1 + " - " + num2  +" es " + respuesta);
                System.out.println("¿Quieres seguir calculando mas numeros?");
                answ=scaner.next();
                if (answ.equals("no")){
                    System.out.println("Gracias por jugar... :)");
                    play=false;
                }
            }
            else if (operacion.equals("*")){
                respuesta=num1*num2;
                System.out.println("Respuesta " + num1 + " * " + num2 + " = " + respuesta);
                System.out.println("¿Quieres seguir calculando mas numeros?");
                answ=scaner.next();
                if (answ.equals("no")){
                    System.out.println("Gracias por jugar... :)");
                    play=false;
                }
            }
            else if (operacion.equals("/")){
                respuesta=(double) num1 /num2;
                System.out.println("Respuesta " + num1 + " / " + num2 + " = " + respuesta);
                System.out.println("¿Quieres seguir calculando mas numeros?");
                answ=scaner.next();
                if (answ.equals("no")){
                    System.out.println("Gracias por jugar... :)");
                    play=false;
                }
            }
            else if (operacion.equals("^")){
                respuesta=num1^num2;
                System.out.println("Respuesta " + num1 + "^" + num2 + " = " + respuesta);
                System.out.println("¿Quieres seguir calculando mas numeros?");
                answ=scaner.next();
                if (answ.equals("no")){
                    System.out.println("Gracias por jugar... :)");
                    play=false;
                }
            }
            else if (operacion.equals("%")){
                respuesta=num1%num2;
                System.out.println("Respuesta " + num1 + " - " + num2 + " = " + respuesta);
                System.out.println("¿Quieres seguir calculando mas numeros?");
                answ=scaner.next();
                if (answ.equals("no")){
                    System.out.println("Gracias por jugar... :)");
                    play=false;
                }

            }else{
                System.out.println("Este caracter no esta registrado, intenta de nuevo...");
            }

        }
        System.out.println("#################");*/
    }
}


