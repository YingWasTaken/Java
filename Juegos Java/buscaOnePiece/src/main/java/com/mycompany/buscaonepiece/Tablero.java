/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buscaonepiece;

/**
 *
 * @author Alumno
 */
public class Tablero {

    private int dimensionX;
    private int dimensionY;
    char[][] tablero = new char[dimensionX][dimensionY];

    int x, y;

    public Tablero(int dimensionX, int dimensionY) {

        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;

        tablero = new char[this.dimensionX][this.dimensionY];

        rellenar();
        mostrar();

    }

    //rellenar tablero
    public void rellenar() {
        for (int i = 0; i < dimensionX; i++) {

            for (int j = 0; j < dimensionY; j++) {
                if (i == 0 && j == 0) {
                    tablero[i][j] = ' ';
                } else if (i == 0 && j != 0) {
                    tablero[i][j] = (char) (j + 48);
                } else if (j == 0 && i != 0) {
                    tablero[i][j] = (char) (i + 48);
                } else if (i != 0 || j != 0) {
                    tablero[i][j] = '?';
                }
            }
        }

        //se les suma 1 porque el marco que uso para mostrar los números abarca la primera dimensión
        x = ((int) (Math.random() * dimensionX+1)); 
        y = ((int) (Math.random() * dimensionY+1));
        
        System.out.println(x + " "+ y);

    }

    //mostrar tablero
    public void mostrar() {
        for (int i = 0; i < dimensionX; i++) {
            for (int j = 0; j < dimensionY; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println("");
        }

    }
    
    public boolean jugada(int x, int y){
        if(this.x == x && this.y == y){
            return true;
        } else{
            
            System.out.println(ayuda(x,y));
            
            
            return false;
        }
    }
    
    public String ayuda(int x,int y){
        
        if(this.y < y){
            return "Más arriba";
        }else if(this.y > y){
            return "Más abajo";
        }else if(this.x < x){
            return "Más a la izquierda";
        } else if(this.x > x){
            return "Más a la derecha";
        }
        
        
        
      return "";  
    }

}
