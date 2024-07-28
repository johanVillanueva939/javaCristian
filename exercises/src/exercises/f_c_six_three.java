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
public class f_c_six_three {
    public static void main(String[] args) {
     
        String y = JOptionPane.showInputDialog(null, "Ingresa un numero positivo menor a 200");
            int x = Integer.parseInt(y);
                int z = 1;
            
            if (x <0 || x>200) {
            
                JOptionPane.showMessageDialog(null, "ERROR", null, JOptionPane.ERROR_MESSAGE);
        }else{
         
                do {                    
                    System.out.println("Tu numero: "+z);
                        z++;
                } while (z <= x);
                JOptionPane.showMessageDialog(null, "FIN.");
                    System.out.println("FIN.");
        }
    }
}
