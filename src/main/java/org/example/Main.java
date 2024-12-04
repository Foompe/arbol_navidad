package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //controlador del bucle
        boolean continuar = true;

        //Instanciamos el scanner
        Scanner sc = new Scanner(System.in);

        //iniciamos el bucle de juego
        while (continuar) {

            //Entrada del usuario del tipo de árbol
            System.out.println("\nElige tipo de árbol: \n" +
                    " 1 - Árbol de navidad\n" +
                    " 2 - Árbol con bolas de navidad\n" +
                    " 3 - Árbol de espumillon\n" +
                    " 4 - Árbol especial\n" +
                    " 5 - Árbol de navidad invertido\n" +
                    " 6 - Salir");

            int tipoArbol = sc.nextInt();


            //Entrada usuario de número de filas
            System.out.println("Escoge número de filas del arbol");

            int filas = sc.nextInt();

            switch (tipoArbol) {
                case 1:
                    System.out.println("Has escogido árbol de navidad con " + filas + " filas.");

                    //bucle para imprimir lineas
                    for (int linea = 0; linea < filas; linea++) {

                        //array para imprimir espacios
                        for (int espacios = 0; espacios < (filas - linea - 1); espacios++) {
                            System.out.print(" ");
                        }

                        //array para imprimir asteriscos
                        for (int asterisco = 0; asterisco < (linea *2) + 1; asterisco++) {
                            System.out.print("*");
                        }

                    System.out.println("");
                    }

                    break;
                case 2:
                    System.out.println("Has escogido árbol con bolas de navidad con " + filas + " filas.\n");
                    /**
                     * | Objetivo:
                     * |    *
                     * |   *=*
                     * |  *===*
                     * | *=====*
                     * |*=======*
                     */




                    break;
                case 3:
                    System.out.println("Has escogido árbol de espumillon con " + filas + " filas.\n");
                    /**
                     * | Objetivo:
                     * |    *
                     * |   ===
                     * |  +++++
                     * | *******
                     * |=========
                     */


                    break;
                case 4:
                    System.out.println("Has escogido árbol de navidad especial con " + filas + " filas.\n");
                    /**
                     * | Objetivo:
                     * |    *
                     * |   *=*
                     * |  *=+=*
                     * | *=+*+=*
                     * |*=+*=*+=*
                     */


                    break;
                case 5:
                    System.out.println("Has escogido árbol de navidad invertido con " + filas + " filas.\n");
                    /**
                     * | Objetivo:
                     * |*********
                     * | *******
                     * |  *****
                     * |   ***
                     * |    *
                     */

                    //bucle para imprimir lineas
                    for (int linea = 0; linea < filas; linea++) {

                        //array para imprimir espacios
                        for (int espacios = 0; espacios < (linea); espacios++) {
                            System.out.print(" ");
                        }

                        //array para imprimir asteriscos
                        for (int asterisco = 0; asterisco < (filas *2) - ((linea *2) + 1); asterisco++) {
                            System.out.print("*");
                        }

                        System.out.println("");
                    }


                    break;
                case 6:
                    System.out.println("Has escogido salir");
                    continuar = false;
                    break;
                default:
                    System.out.println("Error\n");
                    break;
            }

        }
    }
}