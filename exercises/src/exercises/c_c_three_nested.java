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
public class c_c_three_nested {
    
    public static void main(String[] args) {
        
        String opcion =JOptionPane.showInputDialog(null, "Ingresa tu edad", "Juguemos",JOptionPane.QUESTION_MESSAGE);
            int opcionEntero = Integer.parseInt(opcion);
            
            if (opcionEntero <= 17) {
            
                JOptionPane.showMessageDialog(null, "Eres menor de edad🍼");
                    System.out.println("Eres menor de edad");
                
            }else if (opcionEntero >= 18 && opcionEntero <= 39) {
                
                JOptionPane.showMessageDialog(null, "Eres mayor de edad💪");
                    System.out.println("Eres mayor de edad");
                    
                        if (opcionEntero == 20) {
                    
                            int Sure=JOptionPane.showConfirmDialog(null, "De verdad?", "Estas seguro?..", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            
                                if (Sure == JOptionPane.YES_OPTION) {

                                    JOptionPane.showMessageDialog(null, "ESTA BIEN");
                                }else{

                                    JOptionPane.showMessageDialog(null, "MENTIROSO!!!");
                                }
                }
                
            }else if (opcionEntero >= 40 && opcionEntero <= 79) {
            
                JOptionPane.showMessageDialog(null, "Ya tienes bastante experiencia😀");
                    System.out.println("Ya tienes bastante experiencia");
                
            }else if (opcionEntero >= 80) {
            
                JOptionPane.showMessageDialog(null, "Ya tas viejito");
                    System.out.println("Ya tas viejito");
            }
       
    }
}
