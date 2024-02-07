/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.buscaonepiece;

/**
 *
 * @author Alumno
 */
import java.util.Scanner;

public class BuscaOnePiece {

    public static void bar() {
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dimension;
        boolean victoria = false;

        int opcion = 0;
        do {
            bar();
            System.out.println("Seleccione una opción");
            bar();
            System.out.println("0) Cerrar programa");
            System.out.println("1) Nueva partida");
            bar();
            opcion = teclado.nextInt();
            bar();
            switch (opcion) {
                case 0:
                    ;
                    System.out.println("Fin.");
                    break;
                case 1:
                    int turno = 0;
                    System.out.println("Inserte la extensión del mapa:");
                    bar();
                    dimension = teclado.nextInt();
                    bar();
                    Tablero t = new Tablero(dimension+1, dimension+1);
                    bar();

                    do {
                        victoria = false;
                        System.out.println("Inserte una columna en la que excavar");
                        int x = teclado.nextInt();
                        System.out.println("Inserte una fila en la que escalar");
                        int y = teclado.nextInt();

                        turno++;

                        if (t.jugada(x, y) == true) {
                            victoria = true;
                        }
                    } while (victoria == false);

                    System.out.println("Enconstraste el One Piece!");
                    if (turno == 1) {
                        System.out.println("A la primera!");
                    } else {
                        System.out.println("Tardaste " + turno + " turnos");
                    }

                    break;
                default:
                    System.out.println("Carácter inválido");

            }
        } while (opcion != 0);

    }

}
