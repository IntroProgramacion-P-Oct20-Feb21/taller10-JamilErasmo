/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema04;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        double cad = 0;
        double cad2 = 0;
        String cadena = "";
        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos[fila].length; col++) {
                System.out.println("Ingrese lo valores");
                datos[fila][col] = entrada.nextDouble();
                cad = datos[fila][col];
                cadena = String.format("%s%.2f\n", cadena, cad);
            }
        }
        System.out.println(cadena);
    }
    
}
