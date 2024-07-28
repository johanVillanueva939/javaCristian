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
public class d_c_four_three {
    public static void main(String[] args) {
        
        int ejemplo = JOptionPane.showConfirmDialog(null, "QUIERES JUGAR?",null,JOptionPane.YES_NO_OPTION);
        
            if (ejemplo == JOptionPane.YES_OPTION) {
            
                int Uno = JOptionPane.showConfirmDialog(null, "Has sido infiel a alguien alguna vez?",null,JOptionPane.YES_NO_OPTION);
                
                    switch (Uno) {
                    case JOptionPane.YES_OPTION:
                            
                        JOptionPane.showMessageDialog(null, "habras tenido tus razones");
                            System.out.println("habras tenido tus razones");
                        
                        break;
                    case JOptionPane.NO_OPTION:
                        
                        JOptionPane.showMessageDialog(null, "Felicidades!!!! Eres una persona fiel!!");
                             System.out.println("Felicidades!!!! Eres una persona fiel!!");
                        
                        break;
                    default:
                        throw new AssertionError();
                }
        }else {
                
                JOptionPane.showMessageDialog(null, "PORQUE?", null, JOptionPane.QUESTION_MESSAGE);
        }
        
    }
}
