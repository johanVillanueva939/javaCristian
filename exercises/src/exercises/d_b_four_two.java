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
public class d_b_four_two {
    public static void main(String[] args) {
        
         String ejemplo = JOptionPane.showInputDialog(null, "Ingresa un numero entre 1 y 2");
            int ejemploEntero = Integer.parseInt(ejemplo);
            
            switch (ejemploEntero) {
                case 1: 
                        
                       String caso1 = JOptionPane.showInputDialog(null, "Ingresa un numero entre el 1 y el 2") ;
                        int caso1Entero =Integer.parseInt(caso1) ;
                       
                            if (caso1Entero > 2) {
                        
                                JOptionPane.showMessageDialog(null, "ERROR");
                                    System.out.println("ERROR");
                            }else if (caso1Entero == 1) {

                                JOptionPane.showMessageDialog(null, "@CristianDavidHenao en youtube");
                                     System.out.println("https://www.youtube.com/@CristianDavidHenao");
                            }else if (caso1Entero == 2) {
                        
                                JOptionPane.showMessageDialog(null, "SUBSCRIBE");
                                     System.out.println("SUBSCRIBE");
                            }
                       
                    break;
                case 2: JOptionPane.showMessageDialog(null, "BIEVENIDO");
                         System.out.println("BIENVENIDO");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "AQUI NO SE HAY NADA.",null,JOptionPane.QUESTION_MESSAGE);
        }
         
        
    }
}