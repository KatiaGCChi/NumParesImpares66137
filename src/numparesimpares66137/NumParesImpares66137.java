/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares66137;

/**
 *
 * @author TRUJEQUE
 */
public class NumParesImpares66137 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero = 0;
        int suma_par = 0;
        int suma_impar = 0;
        
        while ( numero <= 100) {
            if ( numero % 2 == 0 ) {
                suma_par += numero;
            } else {
                suma_impar += numero;
            }
        numero++;    
        }
        
        System.out.println("Suma de numeros pares: = " + suma_par);
        System.out.println("Suma de numeros impares: = " + suma_impar);
        
    }
    
}
