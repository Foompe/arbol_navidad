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
            System.out.println("""
                               
                               Elige tipo de \u00e1rbol: 
                                1 - Árbol de navidad
                                2 - \u00c1rbol con bolas de navidad
                                3 - \u00c1rbol de espumillon
                                4 - \u00c1rbol especial
                                5 - \u00c1rbol de navidad invertido
                                6 - Salir""");

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
                        for (int asterisco = 0; asterisco < (linea * 2) + 1; asterisco++) {
                            System.out.print("*");
                        }

                        System.out.println("");
                    }

                    break;
                case 2:
                    System.out.println("Has escogido árbol con bolas de navidad con " + filas + " filas.\n");
                    /**
                     * | Objetivo:
                     * |*********
                     * |****a****
                     * |***aaa***
                     * |**aaaaa**
                     * |*aaaaaaa*
                     * |*********
                     * */
                    
                    //bucle para imprimir lineas         
                    for (int linea = 0; linea < filas; linea++) {

                        //array para imprimir espacios
                        for (int espacios = 0; espacios < (filas - linea - 1); espacios++) {
                            System.out.print("*");
                        }

                        //array para imprimir asteriscos
                        for (int asterisco = 0; asterisco < (linea * 2) + 1; asterisco++) {
                            System.out.print("*");
                        }

                        System.out.println("");
                    }
               
                    break;
                case 3:
                    System.out.println("Has escogido árbol de espumillon con " + filas + " filas.\n");
                    /**
                     * | Objetivo:
                     * |     *
                     * |    **
                     * |   *+*
                     * |  *++*
                     * | *+++*
                     * |*++++*
                     */

                    //bucle para imprimir lineas
                    for (int linea = 0; linea < filas; linea++) {

                        //array para imprimir espacios
                        for (int espacios = 0; espacios < (filas - linea - 1); espacios++) {
                            System.out.print(" ");
                        }

                        //array para imprimir asteriscos
                        for (int asterisco = 0; asterisco < (linea * 2) + 1; asterisco++) {

                            System.out.print("*");
                        }

                        System.out.println("");
                    }

                    break;
                case 4:
                    System.out.println("Has escogido árbol de navidad especial con " + filas + " filas.\n");
                    /**
                     * | Objetivo:
                     * |     *
                     * |    +++
                     * |   =====
                     * |  *******
                     * | +++++++++
                     * |===========
                     */
                   // n son las lineas
                            
                   /** for (int i = 0; i < n; i++) {
                        for(int j = 1; j <= n-i; j++) {
                            System.out.print(" ");
                        }
                        for ( int j = 0; j < 2*i+1; j++) {
                            
                        }
                    }
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
                        for (int asterisco = 0; asterisco < (filas * 2) - ((linea * 2) + 1); asterisco++) {
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