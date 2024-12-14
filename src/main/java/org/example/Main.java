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
                                2 - \u00c1rbol de navidad especial.
                                3 - \u00c1rbol con bolas de navidad.
                                4 - \u00c1rbol de espumillon.
                                5 - \u00c1rbol de navidad invertido.
                                6 - Salir.""");

            int tipoArbol = sc.nextInt();

            if (tipoArbol == 6) {
                break;
            }
            //Entrada usuario de número de filas
            System.out.println("Escoge número de filas del arbol");

            int filas = sc.nextInt();

            switch (tipoArbol) {
                case 1:
                    System.out.println("Has escogido árbol de navidad de " + filas + " filas.");
                    /**
                     * | Objetivo:
                     * |    *
                     * |   *** 
                     * |  *****
                     * | *******
                     * |*********
                     * 
                     * Debe hacerse modular, esto es, no nos sirven casos ceñidos, deben ser lo mas abstractos
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
                case 2:
                    System.out.println("Has escogido árbol de navidad especial de " + filas + " filas.\n");
                    /**
                     * | Objetivo:
                     * |*********
                     * |****a****
                     * |***aaa***
                     * |**aaaaa**
                     * |*aaaaaaa*
                     * |*********
                     * 
                     * Se replica el caso anterior, se añade un bucle al inicio y al final para las lineas de '*'
                     * Se cambia el bucle de espacios, asteriscos y se añade uno nuevo despues para hacer la segunda parte
                     * a este buble tambien se le quita la resta de 1 ya que necesitamos un caracter mas.
                     * */

                    //linea inicial de '*'
                    for (int asterisco = 0; asterisco < ((filas * 2)+1); asterisco++) {
                        System.out.print("*");
                    }
                    System.out.println();

                    //bucle para imprimir lineas
                    for (int linea = 0; linea < filas; linea++) {

                        //array para imprimir '*'
                        for (int asterisco = 0; asterisco < (filas - linea); asterisco++) {
                            System.out.print("*");
                        }

                        //array para imprimir 'a'
                        for (int vocal = 0; vocal < (linea * 2) + 1; vocal++) {
                            System.out.print("a");
                        }

                        //array para imprimir '*'
                        for (int asterisco = 0; asterisco < (filas - linea); asterisco++) {
                            System.out.print("*");
                        }

                        System.out.println("");
                    }

                    //linea final de '*'
                    for (int asterisco = 0; asterisco < ((filas * 2)+1); asterisco++) {
                        System.out.print("*");
                    }
                    System.out.println();
               
                    break;
                case 3:
                    System.out.println("Has escogido árbol con bolas de navidad de " + filas + " filas.\n");
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

                        //imprimir un asterisco

                        //array para imprimir asteriscos (bajarlo para que empiece en la tercera linea
                        for (int asterisco = 0; asterisco < (linea * 2) + 1; asterisco++) {
                            System.out.print("*");
                        }

                        //imprimir un asterisco con un condicional para no salir en la primera linea
                        System.out.println("");
                    }

                    break;
                case 4:
                    System.out.println("Has escogido árbol de espumillon de " + filas + " filas.\n");
                    /**
                     * | Objetivo:
                     * |     *
                     * |    +++
                     * |   =====
                     * |  *******
                     * | +++++++++
                     * |===========
                     * 
                     * Este es el mas complejo en cuanto a diseño, debe crearse un array con los caracteres que
                     * se van a usar, o en su defecto podemos usar un condicional if que aun siendo correcto no
                     * es la solucion mas limpia.
                     * 
                     * La estructura de los bucles es exactamente igual que en el prime arbol, cambia lo que
                     * debemos imprimir por pantalla para crear el arbol.
                     * 
                     * Para escoger la opcion a imprimir debemos tomar las posiciones del array 0, 1, 2. 
                     * que es lo mismo que daria el resto de las divisiones entre 3 (linea % 3) nos dara como 
                     * resultado 0,1 u 2 siendo muy util y sencillo de leer, por tanto tendremos lo siguiente:
                     * 
                     * Primera linea: 0/3 = 0 resto 0.  La posicion[0]: '*'
                     * Segunda linea: 1/3 = 0 resto 1.  La posicion[0]: '+'
                     * Tercera linea: 2/3 = 0 resto 2.  La posicion[0]: '='
                     * Cuarta  linea: 3/3 = 1 resto 0.  La posicion[0]: '*'
                     * Quinta  linea: 4/3 = 1 resto 1.  La posicion[0]: '+'
                     * 
                     * Y continua... Este paso es importante, se suele usar mucho en bubles.
                     * Al resto en programación se le llama operador modulo.
                     */
                            
                   //crear un char array
                    char letra[] = {'*','+','='};
                    
                    //bucle para imprimir lineas
                    for (int linea = 0; linea < filas; linea++) {

                        //array para imprimir espacios (porque funciona si es diferente de los otros, falta el -1 despues de linea)
                        for (int espacios = 0; espacios < (filas - linea); espacios++) {
                            System.out.print(" ");
                        }

                        //array para imprimir asteriscos
                        for (int asterisco = 0; asterisco < (linea * 2) + 1; asterisco++) {
                            System.out.print(letra[linea%3]);
                        }

                        System.out.println("");
                    }

                    break;
                case 5:
                    System.out.println("Has escogido árbol de navidad invertido de " + filas + " filas.\n");
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
                default:
                    System.out.println("Error\n");
                    break;
            }

        }
    }
}