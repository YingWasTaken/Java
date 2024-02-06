/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.passwordgenerator;

import java.util.Scanner;

/**
 *
 * @author Ying
 */
public class PasswordGenerator {

    private String[] pass;

    public PasswordGenerator(int numPass, int longitud) {
        pass = new String[numPass];
        generarPass(longitud);
        mostrarPass();
    }

    private void generarPass(int longitud) {
        for (int i = 0; i < pass.length; i++) {
            String passActual = "";
            for (int j = 0; j < longitud; j++) {
                passActual += generarChar();
            }
            pass[i] = passActual;
        }
    }

    private char generarChar() {
        boolean esValido = false;
        int n = 0;

        while (esValido == false) {
            n = (int) (Math.random() * 123);

            if (n == 42 || n == 45 || n == 95) {
                esValido = true;
            } else if (n > 47 && n < 58) {
                esValido = true;
            } else if (n > 64 && n < 91) {
                esValido = true;
            } else if (n > 96 && n < 123) {
                esValido = true;
            }
        }
        return (char) n;
    }

    private void mostrarPass() {
        for (int i = 0; i < pass.length; i++) {
            System.out.println(pass[i]);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("¿Cuantas contraseñas desea generar?");
        System.out.println("-----------------------------------");
        int num = teclado.nextInt();
        System.out.println("-----------------------------------");
        System.out.println("¿Cuantos caracteres deben tener?");
        System.out.println("-----------------------------------");
        int largura = teclado.nextInt();
        System.out.println("-----------------------------------");
        PasswordGenerator contras = new PasswordGenerator(num,largura);

    }

}
