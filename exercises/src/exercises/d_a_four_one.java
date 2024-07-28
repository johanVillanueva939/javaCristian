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
public class d_a_four_one {
    public static void main(String[] args) {
        
       String ejemplo = JOptionPane.showInputDialog(null, "Ingresa un numero del 1 al 5");
            int ejemploEntero = Integer.parseInt(ejemplo);
            
            switch (ejemploEntero) {
                case 1: JOptionPane.showMessageDialog(null, "HOLA!!");
                            System.out.println("HOLA!!");
                    break;
                case 2: JOptionPane.showMessageDialog(null, "BIEVENIDO");
                            System.out.println("BIEVENIDO");
                    break;
                case 3: JOptionPane.showMessageDialog(null, "WELCOME");
                            System.out.println("WELCOME");
                    break;
                case 4: JOptionPane.showMessageDialog(null, "QUE ALEGRIA");
                            System.out.println("QUE ALEGRIA");
                    break;
                case 5: JOptionPane.showMessageDialog(null, "SI");
                            System.out.println("SI");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "HEY HEY HEY PEQUEÑA, A DONDE VAS?",null,JOptionPane.QUESTION_MESSAGE);
        }
    }
}
