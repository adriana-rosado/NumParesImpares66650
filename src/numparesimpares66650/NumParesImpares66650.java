/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares66650;

/**
 *
 * @author Adriana
 */
public class NumParesImpares66650 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n= 1;
        int sum_par=0;
        int sum_imp=0;
        while (n<=100){
            if (n%2==0){
                sum_par +=n;
            } else {
                sum_imp +=n;
            }
            n++;
        }
        System.out.println("La suma de los números pares son: " + sum_par);
        System.out.println("La suma de los números impares son: " + sum_imp);
    }
    
    
}
