/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import javax.swing.JOptionPane;

/**
 *
 * @author asusi
 */
public class c_b_three_double {
    
    public static void main(String[] args) {
          //Condicional doble
        String doble=JOptionPane.showInputDialog(null,"Ingrese un numero: ");
            int dobleEntero = Integer.parseInt(doble);
      
        if (dobleEntero > 10) {
            System.out.println("Es mayor a diez");
        }else{
            System.out.println("No es mayor a diez");
        }
    }
}
