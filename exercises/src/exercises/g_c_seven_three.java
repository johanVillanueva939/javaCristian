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
public class g_c_seven_three {
    public static void main(String[] args) {
        String y =JOptionPane.showInputDialog(null,"Elige un numero del 1 al 200");
            int x =Integer.parseInt(y);
                
            
            if (x < 0 || x>200) {
            JOptionPane.showMessageDialog(null, "ERROR", null, JOptionPane.ERROR_MESSAGE);
        }else{
                System.out.println("INCREMENTO");
                for (int z=1; z <= x; z++) {
                    System.out.println("Incremento de: "+z);
                    
                }
                
                System.out.println("DECREMENTO");
                for (int z=x; z>0; z--) {
                    System.out.println("Decremento de : -"+z);
                    
                }
                System.out.println("FIN.");
                JOptionPane.showMessageDialog(null, "FIN");
        }
    }
}
