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
public class e_c_five_three {
    public static void main(String[] args) {
        
        String str = JOptionPane.showInputDialog(null, "Ingresa un numero positivo menor a 300");
            int num = Integer.parseInt(str);
                int num1 = 1;
        
            if (num < 0 || num > 300) {
            
                JOptionPane.showMessageDialog(null, "ERROR", null, JOptionPane.ERROR_MESSAGE);
        }else {
            
                while (num1 <= num) {
                    
                    System.out.println("Numero: "+num1);
                    num1++;
                    
                }
                JOptionPane.showMessageDialog(null, "Finalizado");
                System.out.println("FIN");
                
        }
        
    }
}
