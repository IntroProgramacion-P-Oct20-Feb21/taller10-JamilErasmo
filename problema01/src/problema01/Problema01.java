/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

/**
 *
 * @author Usuario iTC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 8}, {
            7, 9.4, 10, 9}};
        String[] estudiantes = {"Jerry Ponce", "Grabiela Levis","David Vell"};
        double valor = 0;
        String est = "";
        for (int es = 0; es < estudiantes.length; es++){
            est = estudiantes[es];
            for (int fila = 0; fila < notas.length; fila++ ){
                double suma = 0;
                for (int col = 0; col < notas[fila].length; col++){
                    suma = suma + notas[fila][col];
                    valor = suma / notas[fila].length;
                }
               
            }
            System.out.printf("Estudiante: %s tiene un promedio de: %.2f\n"
                    ,est, valor);
        }
    }
    
}
