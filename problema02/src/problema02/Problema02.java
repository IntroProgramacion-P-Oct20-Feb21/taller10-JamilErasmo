/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;
import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];
        int nombre;
        double suma = 0;
        String ven = "";
        for (int i = 0; i < vendedores.length; i++){
            System.out.println("Ingrese 1 para Jessica o 2 para Robert");
            nombre = entrada.nextInt();
            if (nombre == 1){
                for (int col = 0; col < 5; col++){
                    System.out.println("Ingrese ventas de Jessica");
                    ventas[0][col] = entrada.nextDouble();
                    suma = suma + ventas[0][col];
                }
            }else{
                for (int col = 0; col < 5; col++){
                    System.out.println("Ingrese ventas de Robert");
                    ventas[0][col] = entrada.nextDouble();
                    suma = suma + ventas[0][col];
                }
            
            }
            ven = String.format("%sVendedores(a) %s\n", ven, vendedores[i]);
        }
        System.out.printf("%sHan realizado un total de: %.2f en ventas",ven,
                suma);
    }
    
}
